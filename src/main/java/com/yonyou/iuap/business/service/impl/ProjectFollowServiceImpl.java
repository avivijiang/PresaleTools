package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.business.entity.ProjectFollow;
import com.yonyou.iuap.business.entity.ProjectFollowExample;
import com.yonyou.iuap.business.mapper.sub.SubProjectFollowMapper;
import com.yonyou.iuap.business.service.ProjectFollowService;

/**
 * 项目进度
 * @author sangw
 *
 */
@Service("projectFollowService")
public class ProjectFollowServiceImpl implements ProjectFollowService{

	@Autowired
	private SubProjectFollowMapper projectFollowMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	public void insertSelective(ProjectFollow record)throws Exception{
		projectFollowMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<ProjectFollow> selectByExample()throws Exception{
		ProjectFollowExample example = new ProjectFollowExample();
		return projectFollowMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	public void updateByPrimaryKeySelective(ProjectFollow record)throws Exception {
		projectFollowMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	public void deleteByExample(ProjectFollow record)throws Exception {
		ProjectFollowExample example = new ProjectFollowExample();
		example.createCriteria().andFollowIdEqualTo(record.getFollowId());
//		example.createCriteria().andFollowIdIn(values);
		projectFollowMapper.deleteByExample(example);
	}
	
}
