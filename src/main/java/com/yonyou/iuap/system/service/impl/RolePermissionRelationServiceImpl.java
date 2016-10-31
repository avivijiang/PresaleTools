package com.yonyou.iuap.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.system.entity.RolePermissionRelation;
import com.yonyou.iuap.system.entity.RolePermissionRelationExample;
import com.yonyou.iuap.system.mapper.sub.SubRolePermissionRelationMapper;
import com.yonyou.iuap.system.service.RolePermissionRelationService;

/**
 * 角色权限关系
 * @author sangw
 *
 */
@Service("rolePermissionRelationService")
public class RolePermissionRelationServiceImpl implements RolePermissionRelationService {
	
	@Autowired
	SubRolePermissionRelationMapper rolePermissionRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
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
	@Transactional
	public void updateByPrimaryKeySelective(RolePermissionRelation record)throws Exception {
		rolePermissionRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(RolePermissionRelation rolePermissionRelation)throws Exception {
		RolePermissionRelationExample example = new RolePermissionRelationExample();
		example.createCriteria().andRolePermissionIdEqualTo(rolePermissionRelation.getRolePermissionId());
//		example.createCriteria().andRolePermissionIdIn(values);
		rolePermissionRelationMapper.deleteByExample(example);
	}
	
	/**
	 * 给角色设置权限
	 * @param record
	 */
	@Transactional
	public void update(Long roleId,Long[] permissionIds)throws Exception {
		List<RolePermissionRelation> rprList = new ArrayList<RolePermissionRelation>();
		RolePermissionRelationExample example = new RolePermissionRelationExample();
		//删除当前角色的所有权限
		example.createCriteria().andRoleIdEqualTo(roleId);
		rolePermissionRelationMapper.deleteByExample(example);
		RolePermissionRelation rolePermissionRelation ;
		if(permissionIds.length>0){
			for (Long permissionId : permissionIds) {
				rolePermissionRelation = new RolePermissionRelation();
				rolePermissionRelation.setRoleId(roleId);
				rolePermissionRelation.setPermissionId(permissionId);
				rprList.add(rolePermissionRelation);
			}
			//添加角色和权限关系
			rolePermissionRelationMapper.addBatch(rprList);
		}
	}

}
