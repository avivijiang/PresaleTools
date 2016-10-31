package com.yonyou.iuap.business.mapper.sub;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.iuap.business.dto.ProjectInfoDto;
import com.yonyou.iuap.business.mapper.ProjectInformationMapper;

public interface SubProjectInformationMapper extends ProjectInformationMapper{

	List<ProjectInfoDto> queryPage(@Param("index") int index,@Param("pageSize") int pageSize,@Param("regionId") long regionId);

}
