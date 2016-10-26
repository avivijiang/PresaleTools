package com.yonyou.iuap.system.mapper.sub;

import java.util.List;

import com.yonyou.iuap.system.entity.UserRegionRelation;
import com.yonyou.iuap.system.mapper.UserRegionRelationMapper;

public interface SubUserRegionRelationMapper extends UserRegionRelationMapper{
	
	int addBatch(List<UserRegionRelation> record);

}
