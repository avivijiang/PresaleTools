package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.entity.RegionBranchRelation;

public interface RegionBranchRelationService {
	
	public void insertSelective(RegionBranchRelation record)throws Exception;
	
	public List<RegionBranchRelation> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(RegionBranchRelation record)throws Exception;
	
	public void deleteByExample(RegionBranchRelation record)throws Exception;

}
