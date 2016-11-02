package com.yonyou.iuap.business.mapper.sub;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.iuap.business.entity.ProjectInfoVO;
import com.yonyou.iuap.business.mapper.ProjectInformationMapper;

public interface SubProjectInformationMapper extends ProjectInformationMapper{

	List<ProjectInfoVO> queryPage(@Param("index") int index,@Param("pageSize") int pageSize,@Param("regionId") long regionId,@Param("projectName") String projectName);
	
	int queryCount(@Param("regionId") long regionId,@Param("projectName") String projectName);
	
	ProjectInfoVO queryByProjectId(@Param("projectId") long projectId);

}
