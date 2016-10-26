package com.yonyou.iuap.business.service;

import java.util.List;

import com.yonyou.iuap.business.entity.RegionInfo;

public interface RegionInfoService {

	public void insertSelective(RegionInfo record)throws Exception;
	
	public List<RegionInfo> selectByExample()throws Exception;
	
	public void updateByPrimaryKeySelective(RegionInfo record)throws Exception;
	
	public void deleteByExample(RegionInfo record)throws Exception;
	
}
