package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import com.yonyou.iuap.system.entity.UserRoleRelation;
import com.yonyou.iuap.system.mapper.UserRoleRelationMapper;

public interface SubUserRoleRelationMapper extends UserRoleRelationMapper{

	int addBatch(List<UserRoleRelation> record);
	
}
