package com.yonyou.iuap.system.service;

import java.util.List;

import com.yonyou.iuap.system.entity.SystemPermission;

public interface SystemPermissionService {
	
	public void insertSelective(SystemPermission record)throws Exception;
	
	public List<SystemPermission> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(SystemPermission record)throws Exception;
	
	public void deleteByExample(SystemPermission systemPermission)throws Exception;

}
