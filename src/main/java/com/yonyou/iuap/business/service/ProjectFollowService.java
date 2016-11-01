package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.dto.ProjectFollowRecordDto;
import com.yonyou.iuap.business.entity.ProjectFollow;

public interface ProjectFollowService {

	public String insertSelective(ProjectFollowRecordDto dto, String loginName) throws Exception;
	
	public List<ProjectFollow> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(ProjectFollow record)throws Exception;
	
	public void deleteByExample(ProjectFollow record)throws Exception;
	
}
