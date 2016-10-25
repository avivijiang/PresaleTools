package com.yonyou.iuap.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.system.entity.RolePermissionRelation;
import com.yonyou.iuap.system.entity.RolePermissionRelationExample;
import com.yonyou.iuap.system.mapper.RolePermissionRelationMapper;
import com.yonyou.iuap.system.service.RolePermissionRelationService;

/**
 * 角色权限关系
 * @author sangw
 *
 */
@Service("rolePermissionRelationService")
public class RolePermissionRelationServiceImpl implements RolePermissionRelationService {
	
	@Autowired
	RolePermissionRelationMapper rolePermissionRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	public void insertSelective(RolePermissionRelation record)throws Exception{
		rolePermissionRelationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<RolePermissionRelation> selectByExample()throws Exception{
		RolePermissionRelationExample example = new RolePermissionRelationExample();
		return rolePermissionRelationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	public void updateByPrimaryKeySelective(RolePermissionRelation record)throws Exception {
		rolePermissionRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	public void deleteByExample(RolePermissionRelation rolePermissionRelation)throws Exception {
		RolePermissionRelationExample example = new RolePermissionRelationExample();
		example.createCriteria().andRolePermissionIdEqualTo(rolePermissionRelation.getRolePermissionId());
//		example.createCriteria().andRolePermissionIdIn(values);
		rolePermissionRelationMapper.deleteByExample(example);
	}

}
