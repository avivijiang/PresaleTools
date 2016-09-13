package com.yonyou.iuap.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.project.entity.ProjectInfo;
import com.yonyou.iuap.project.mapper.sub.SubProjectInfoMapper;
import com.yonyou.iuap.project.service.IProjectInfoService;

@Service("projectInfoService")
public class ProjectInfoServiceImple implements IProjectInfoService	{

	@Autowired
	SubProjectInfoMapper subProjectInfoMapper;
	
	@Override
	public List<ProjectInfo> queryAllProjectInfo() {
		com.yonyou.iuap.project.entity.ProjectInfoExample example = new com.yonyou.iuap.project.entity.ProjectInfoExample();
		example.createCriteria();
		List<ProjectInfo> list = subProjectInfoMapper.selectByExample(example);
		return list;
	}
	
}
