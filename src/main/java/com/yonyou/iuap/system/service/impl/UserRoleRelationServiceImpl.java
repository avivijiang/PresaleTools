package com.yonyou.iuap.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.system.entity.UserRoleRelation;
import com.yonyou.iuap.system.entity.UserRoleRelationExample;
import com.yonyou.iuap.system.mapper.sub.SubUserRoleRelationMapper;
import com.yonyou.iuap.system.service.UserRoleRelationService;

/**
 * 用户角色关系
 * @author sangw
 *
 */
@Service("userRoleRelationService")
public class UserRoleRelationServiceImpl implements UserRoleRelationService {

	@Autowired
	SubUserRoleRelationMapper userRoleRelationMapper;
	
	/**
	 * 添加用户角色关系
	 * @param userRoleRelation
	 */
	public void insertSelective(UserRoleRelation record)throws Exception{
		userRoleRelationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<UserRoleRelation> selectByExample()throws Exception{
		UserRoleRelationExample example = new UserRoleRelationExample();
		List<UserRoleRelation> userRoleRelationList = userRoleRelationMapper.selectByExample(example);
		return userRoleRelationList;
	}
	
	/**
	 * 修改
	 * @param record
	 * @throws Exception
	 */
	public void updateByPrimaryKeySelective(UserRoleRelation record)throws Exception {
		userRoleRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param userRoleRelation
	 * @throws Exception
	 */
	public void  deleteByExample(UserRoleRelation userRoleRelation)throws Exception {
		UserRoleRelationExample example = new UserRoleRelationExample();
		example.createCriteria().andRoleIdEqualTo(userRoleRelation.getRoleId());
//		example.createCriteria().andRoleIdIn(values);//批量删除
		userRoleRelationMapper.deleteByExample(example);
	}
}
