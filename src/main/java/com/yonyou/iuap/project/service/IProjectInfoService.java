package com.yonyou.iuap.project.service;

import java.util.List;

import com.yonyou.iuap.project.entity.ProjectInfo;

/**
 * 项目服务
 * @author sangw
 *
 */
public interface IProjectInfoService {

	/**
	 * 查询所有项目
	 * @return
	 */
	public List<ProjectInfo> queryAllProjectInfo();
	
}
