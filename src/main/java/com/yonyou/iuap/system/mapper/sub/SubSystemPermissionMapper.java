package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.mapper.SystemPermissionMapper;

public interface SubSystemPermissionMapper extends SystemPermissionMapper {
	
	List<SystemPermission> selectByPrimaryUserLoginname(String login_name);
	
	List<SystemPermission> selectByUserId(Long userId);
	
	List<SystemPermission> selectByRoleId(Long roleId);

}
