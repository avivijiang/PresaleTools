package com.yonyou.iuap.business.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.dto.ProjectFollowRecordDto;
import com.yonyou.iuap.business.entity.ProjectFollow;
import com.yonyou.iuap.business.entity.ProjectFollowExample;
import com.yonyou.iuap.business.entity.ProjectInformation;
import com.yonyou.iuap.business.mapper.sub.SubProjectFollowMapper;
import com.yonyou.iuap.business.mapper.sub.SubProjectInformationMapper;
import com.yonyou.iuap.business.service.ProjectFollowService;
import com.yonyou.iuap.system.entity.SystemUserInfo;
import com.yonyou.iuap.system.entity.SystemUserInfoExample;
import com.yonyou.iuap.system.mapper.sub.SubSystemUserInfoMapper;

/**
 * 项目进度
 * 
 * @author sangw
 *
 */
@Service("projectFollowService")
public class ProjectFollowServiceImpl implements ProjectFollowService {

	@Autowired
	private SubProjectFollowMapper projectFollowMapper;

	@Autowired
	private SubProjectInformationMapper projectInformationMapper;

	@Autowired
	private SubSystemUserInfoMapper systemUserInfoMapper;

	/**
	 * 添加
	 * 
	 * @param record
	 */
	@Transactional
	public String insertSelective(ProjectFollowRecordDto dto, String loginName) throws Exception {

		ProjectFollow record = new ProjectFollow();
		BeanUtils.copyProperties(dto, record);

		// 查询当前登录人信息
		SystemUserInfoExample systemUserInfoExample = new SystemUserInfoExample();
		systemUserInfoExample.createCriteria().andLoginNameEqualTo(loginName);
		List<SystemUserInfo> listSystemUserInfo = systemUserInfoMapper.selectByExample(systemUserInfoExample);
		if (listSystemUserInfo.isEmpty()) {
			return "未获取到登录人信息！";
		}
		
		// 添加跟进数据
		record.setCreatorName(listSystemUserInfo.get(0).getName());
		record.setCreateTime(new Date());
		projectFollowMapper.insertSelective(record);
		// 更新项目信息
		ProjectInformation projectInformation = projectInformationMapper.selectByPrimaryKey(record.getProjectId());
		projectInformation.setSalesStage(record.getSalesStage());
		projectInformationMapper.updateByPrimaryKeySelective(projectInformation);
		
		return null;
	}

	/**
	 * 查询
	 * 
	 * @param example
	 * @return
	 */
	public List<ProjectFollow> selectByExample() throws Exception {
		ProjectFollowExample example = new ProjectFollowExample();
		return projectFollowMapper.selectByExample(example);
	}

	/**
	 * 修改
	 * 
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(ProjectFollow record) throws Exception {
		projectFollowMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 删除
	 * 
	 * @param example
	 */
	@Transactional
	public void deleteByExample(ProjectFollow record) throws Exception {
		ProjectFollowExample example = new ProjectFollowExample();
		example.createCriteria().andFollowIdEqualTo(record.getFollowId());
		// example.createCriteria().andFollowIdIn(values);
		projectFollowMapper.deleteByExample(example);
	}
}
