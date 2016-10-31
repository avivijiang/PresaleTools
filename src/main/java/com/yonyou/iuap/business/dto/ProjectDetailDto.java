package com.yonyou.iuap.business.dto;

import java.util.List;

import com.yonyou.iuap.business.entity.ProjectFollow;
import com.yonyou.iuap.business.entity.ProjectInfoVO;

public class ProjectDetailDto {

	private ProjectInfoVO projectInfoVO;
	
	private List<ProjectFollow> listProjectFollow;


	public ProjectInfoVO getProjectInfoVO() {
		return projectInfoVO;
	}

	public void setProjectInfoVO(ProjectInfoVO projectInfoVO) {
		this.projectInfoVO = projectInfoVO;
	}

	public List<ProjectFollow> getListProjectFollow() {
		return listProjectFollow;
	}

	public void setListProjectFollow(List<ProjectFollow> listProjectFollow) {
		this.listProjectFollow = listProjectFollow;
	}
	
	
}
