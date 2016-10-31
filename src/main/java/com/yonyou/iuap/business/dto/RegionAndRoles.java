package com.yonyou.iuap.business.dto;

import java.util.ArrayList;
import java.util.List;

import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.system.entity.SystemRole;

public class RegionAndRoles {

	private List<RegionInfo> regionInfoList = new ArrayList<RegionInfo>();
	
	private List<SystemRole> systemRoleList = new ArrayList<SystemRole>();

	public List<RegionInfo> getRegionInfoList() {
		return regionInfoList;
	}

	public void setRegionInfoList(List<RegionInfo> regionInfoList) {
		this.regionInfoList = regionInfoList;
	}

	public List<SystemRole> getSystemRoleList() {
		return systemRoleList;
	}

	public void setSystemRoleList(List<SystemRole> systemRoleList) {
		this.systemRoleList = systemRoleList;
	}
	
	
	
}
