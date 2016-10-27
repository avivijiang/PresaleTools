package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.entity.ProjectInformation;
import com.yonyou.iuap.business.entity.ProjectInformationExample;
import com.yonyou.iuap.business.mapper.sub.SubProjectInformationMapper;
import com.yonyou.iuap.business.service.ProjectInformationService;

/**
 * 项目信息
 * @author sangw
 *
 */
@Service("projectInformationService")
public class ProjectInformationServiceImpl implements ProjectInformationService {

	@Autowired
	private SubProjectInformationMapper projectInformationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(ProjectInformation record)throws Exception{
		projectInformationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<ProjectInformation> selectByExample()throws Exception{
		ProjectInformationExample example = new ProjectInformationExample();
		return projectInformationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(ProjectInformation record)throws Exception {
		projectInformationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(ProjectInformation record)throws Exception {
		ProjectInformationExample example = new ProjectInformationExample();
		example.createCriteria().andProjectIdEqualTo(record.getProjectId());
//		example.createCriteria().andProjectIdIn(values);
		projectInformationMapper.deleteByExample(example);
	}
	
}
