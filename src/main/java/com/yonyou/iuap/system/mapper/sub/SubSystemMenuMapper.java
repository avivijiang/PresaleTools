package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import com.yonyou.iuap.system.entity.SystemMenu;
import com.yonyou.iuap.system.mapper.SystemMenuMapper;

public interface SubSystemMenuMapper extends SystemMenuMapper {

	List<SystemMenu> queryRoleMenu(String loginName);
	
}
