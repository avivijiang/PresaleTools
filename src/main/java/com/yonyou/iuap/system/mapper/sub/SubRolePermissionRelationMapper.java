package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import com.yonyou.iuap.system.entity.RolePermissionRelation;
import com.yonyou.iuap.system.mapper.RolePermissionRelationMapper;

public interface SubRolePermissionRelationMapper extends RolePermissionRelationMapper{

	 int addBatch(List<RolePermissionRelation> record);
	 
}
