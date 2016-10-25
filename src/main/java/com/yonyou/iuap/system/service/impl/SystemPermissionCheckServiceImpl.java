package com.yonyou.iuap.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.mapper.SystemPermissionMapper;
import com.yonyou.iuap.system.service.SystemPermissionCheckService;

/**
 * 
 * @author sangw
 *
 */
@Service("systemPermissionCheckService")
public class SystemPermissionCheckServiceImpl implements SystemPermissionCheckService {

	@Autowired
	private SystemPermissionMapper systemPermissionMapper;

	/**
	 * 查询当前用户权限
	 * 
	 * @param longinName
	 * @return
	 */
	public List<SystemPermission> queryUserPermission(String longinName) {
		List<SystemPermission> systemPermissionList = systemPermissionMapper.selectByPrimaryUserLoginname(longinName);
		return systemPermissionList;
	}

}
