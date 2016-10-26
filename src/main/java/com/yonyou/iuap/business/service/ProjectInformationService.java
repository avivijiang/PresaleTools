package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.entity.ProjectInformation;

public interface ProjectInformationService {

	public void insertSelective(ProjectInformation record) throws Exception;

	public List<ProjectInformation> selectByExample() throws Exception;

	public void updateByPrimaryKeySelective(ProjectInformation record) throws Exception;

	public void deleteByExample(ProjectInformation record) throws Exception;

}
