package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.SystemPermission;

public interface SystemPermissionCheckService {

	public List<SystemPermission> queryUserPermission(String longinName);
	
	public List<SystemPermission> queryPermissionByRoleId(Long roleId);
	
}
