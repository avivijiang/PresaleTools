package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.dto.PageList;
import com.yonyou.iuap.business.dto.ProjectDetailDto;
import com.yonyou.iuap.business.dto.ProjectInformationDto;
import com.yonyou.iuap.business.entity.ProjectInformation;

public interface ProjectInformationService {

	public void insertSelective(ProjectInformation record) throws Exception;

	public List<ProjectInformation> selectByExample() throws Exception;

	public void updateByPrimaryKeySelective(ProjectInformation record) throws Exception;

	public void deleteByExample(ProjectInformation record) throws Exception;
	
	public PageList querPage(int index,int pageSize,long regionId,String projectName)throws Exception;
	
	public void insertProjectInformation(ProjectInformationDto dto)throws Exception;
	
	public void deleteProjectInformation(Long projectId)throws Exception;
	
	public void updateProjectInformation(ProjectInformationDto dto)throws Exception;
	
	public ProjectDetailDto queryDetail(Long projectId)throws Exception;

}
