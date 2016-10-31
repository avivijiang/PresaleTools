package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.business.dto.RegionAndRoles;
import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.business.entity.RegionInfoExample;
import com.yonyou.iuap.business.mapper.sub.SubRegionInfoMapper;
import com.yonyou.iuap.business.service.RegionAndBranchService;
import com.yonyou.iuap.system.entity.SystemRole;
import com.yonyou.iuap.system.entity.SystemRoleExample;
import com.yonyou.iuap.system.mapper.sub.SubSystemRoleMapper;

@Service("regionAndBranchService")
public class RegionAndBranchServiceImpl implements RegionAndBranchService{
	
	@Autowired
	private SubRegionInfoMapper regionInfoMapper;
	
	@Autowired
	SubSystemRoleMapper systemRoleMapper;
	
	/**
	 * 查询所有大区
	 * @param example
	 * @return
	 */
	public List<RegionInfo> selectByExample()throws Exception{
		RegionInfoExample example = new RegionInfoExample();
		return regionInfoMapper.selectByExample(example);
	}
	
	/**
	 * 查询所有大区
	 * @param example
	 * @return
	 */
	public RegionAndRoles selectAllRegionAndRole()throws Exception{
		RegionAndRoles regionAndRoles = new RegionAndRoles();
		RegionInfoExample example = new RegionInfoExample();
		//查询所有大区
		List<RegionInfo> regionInfoList = regionInfoMapper.selectByExample(example);
		
		SystemRoleExample systemRoleExample = new SystemRoleExample();
		//查询所有角色
		List<SystemRole> systemRoleList = systemRoleMapper.selectByExample(systemRoleExample);
		regionAndRoles.setRegionInfoList(regionInfoList);
		regionAndRoles.setSystemRoleList(systemRoleList);
		return regionAndRoles;
	}

}
