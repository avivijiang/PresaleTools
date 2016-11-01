package com.yonyou.iuap.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.business.entity.RegionInfoExample;
import com.yonyou.iuap.business.mapper.sub.SubRegionInfoMapper;
import com.yonyou.iuap.system.dto.UserPageDto;
import com.yonyou.iuap.system.entity.SystemRole;
import com.yonyou.iuap.system.entity.SystemRoleExample;
import com.yonyou.iuap.system.entity.SystemUserInfo;
import com.yonyou.iuap.system.entity.SystemUserInfoExample;
import com.yonyou.iuap.system.entity.UserInfoVO;
import com.yonyou.iuap.system.entity.UserRegionRelation;
import com.yonyou.iuap.system.entity.UserRegionRelationExample;
import com.yonyou.iuap.system.entity.UserRoleRelation;
import com.yonyou.iuap.system.entity.UserRoleRelationExample;
import com.yonyou.iuap.system.mapper.sub.SubSystemRoleMapper;
import com.yonyou.iuap.system.mapper.sub.SubSystemUserInfoMapper;
import com.yonyou.iuap.system.mapper.sub.SubUserRegionRelationMapper;
import com.yonyou.iuap.system.mapper.sub.SubUserRoleRelationMapper;
import com.yonyou.iuap.system.service.SystemUserService;

@Service("systemUserService")
public class SystemUserServiceImpl implements SystemUserService {

	@Autowired
	private SubSystemUserInfoMapper systemUserInfoMapper;

	@Autowired
	private SubRegionInfoMapper regionInfoMapper;

	@Autowired
	private SubSystemRoleMapper systemRoleMapper;

	@Autowired
	private SubUserRoleRelationMapper userRoleRelationMapper;

	@Autowired
	private SubUserRegionRelationMapper userRegionRelationMapper;

	public UserPageDto querUserInfoList(int pageIndex, int pageSize) throws Exception {

		UserPageDto userPageDto = new UserPageDto();
		userPageDto.setPageIndex(pageIndex);
		userPageDto.setPageSize(pageSize);

		// 查询user列表
		List<SystemUserInfo> listSystemUserInfo = systemUserInfoMapper.queryUserInfo(pageIndex, pageSize);
		List<Long> listIds = new ArrayList<Long>();
		for (SystemUserInfo systemUserInfo : listSystemUserInfo) {
			listIds.add(systemUserInfo.getId());
		}
		SystemUserInfoExample example = new SystemUserInfoExample();
		int pageNum = systemUserInfoMapper.countByExample(example);
		userPageDto.setPageNum(pageNum);

		// 查询用户当前的角色
		UserRoleRelationExample userRoleRelationExample = new UserRoleRelationExample();
		userRoleRelationExample.createCriteria().andUserIdIn(listIds);
		List<UserRoleRelation> listUserRoleRelation = userRoleRelationMapper.selectByExample(userRoleRelationExample);
		// 查询用户当前的大区
		UserRegionRelationExample userRegionRelationExample = new UserRegionRelationExample();
		userRegionRelationExample.createCriteria().andUserIdIn(listIds);
		List<UserRegionRelation> listUserRegionRelation = userRegionRelationMapper
				.selectByExample(userRegionRelationExample);

		List<UserInfoVO> list = setUserInfoVO(listSystemUserInfo, listUserRoleRelation, listUserRegionRelation);
		userPageDto.setListUserInfo(list);
		return userPageDto;
	}

	/**
	 * 整合数据
	 * @param listSystemUserInfo
	 * @param listUserRoleRelation
	 * @param listUserRegionRelation
	 * @return
	 */
	public List<UserInfoVO> setUserInfoVO(List<SystemUserInfo> listSystemUserInfo,
			List<UserRoleRelation> listUserRoleRelation, List<UserRegionRelation> listUserRegionRelation) {
		List<UserInfoVO> userInfoList = new ArrayList<UserInfoVO>();

		// 查询所有大区
		RegionInfoExample example = new RegionInfoExample();
		List<RegionInfo> regionInfoList = regionInfoMapper.selectByExample(example);
		Map<Long, RegionInfo> mapRegionInfo = creatMapRegionInfo(regionInfoList);

		// 查询所有角色
		SystemRoleExample systemRoleExample = new SystemRoleExample();
		List<SystemRole> systemRoleList = systemRoleMapper.selectByExample(systemRoleExample);
		Map<Long, SystemRole> mapSystemRole = creatMapSystemRole(systemRoleList);

		UserInfoVO userInfoVO = null;
		for (SystemUserInfo systemUserInfo : listSystemUserInfo) {
			userInfoVO = new UserInfoVO();
			BeanUtils.copyProperties(systemUserInfo, userInfoVO);
			// List<SystemRole> listSystemRole = userRoleList(systemUserInfo,
			// mapSystemRole, listUserRoleRelation);
			userInfoVO.setListSystemRole(userRoleList(systemUserInfo, mapSystemRole, listUserRoleRelation));
			userInfoVO.setListRegionInfo(userRegionList(systemUserInfo, mapRegionInfo, listUserRegionRelation));
			userInfoList.add(userInfoVO);
		}

		return userInfoList;
	}

	/**
	 * 大区list转map
	 * 
	 * @param regionInfoList
	 * @return
	 */
	public Map<Long, RegionInfo> creatMapRegionInfo(List<RegionInfo> regionInfoList) {
		Map<Long, RegionInfo> map = new HashMap<Long, RegionInfo>();
		for (RegionInfo regionInfo : regionInfoList) {
			map.put(regionInfo.getRegionId(), regionInfo);
		}
		return map;
	}

	/**
	 * 角色list转map
	 * 
	 * @param systemRoleList
	 * @return
	 */
	public Map<Long, SystemRole> creatMapSystemRole(List<SystemRole> systemRoleList) {
		Map<Long, SystemRole> map = new HashMap<Long, SystemRole>();
		for (SystemRole systemRole : systemRoleList) {
			map.put(systemRole.getRoleId(), systemRole);
		}
		return map;
	}

	/**
	 * 当前用户拥有的角色list
	 * 
	 * @param systemUserInfo 当前用户
	 * @param mapSystemRole 所有角色map
	 * @param listUserRoleRelation
	 * @return
	 */
	public List<SystemRole> userRoleList(SystemUserInfo systemUserInfo, Map<Long, SystemRole> mapSystemRole,
			List<UserRoleRelation> listUserRoleRelation) {
		List<SystemRole> list = new ArrayList<SystemRole>();
		long userId = systemUserInfo.getId();
		for (UserRoleRelation userRoleRelation : listUserRoleRelation) {
			if (userId == userRoleRelation.getUserId()) {
				list.add(mapSystemRole.get(userRoleRelation.getRoleId()));
			}
		}
		return list;
	}

	/**
	 * 当前用户拥有的大区list
	 * 
	 * @param systemUserInfo 当前用户
	 * @param mapRegionInfo 所有大区map
	 * @param listUserRegionRelation
	 * @return
	 */
	public List<RegionInfo> userRegionList(SystemUserInfo systemUserInfo, Map<Long, RegionInfo> mapRegionInfo,
			List<UserRegionRelation> listUserRegionRelation) {
		List<RegionInfo> list = new ArrayList<RegionInfo>();
		long userId = systemUserInfo.getId();
		for (UserRegionRelation userRegionRelation : listUserRegionRelation) {
			if (userRegionRelation.getUserId() == userId) {
				list.add(mapRegionInfo.get(userRegionRelation.getRegionId()));
			}
		}
		return list;
	}

}
