package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.dto.RegionAndRoles;
import com.yonyou.iuap.business.entity.RegionInfo;

public interface RegionAndBranchService {

	public List<RegionInfo> selectByExample()throws Exception;

	public RegionAndRoles selectAllRegionAndRole()throws Exception;
	
}
