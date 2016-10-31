package com.yonyou.iuap.system.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.system.entity.RolePermissionRelationExample;
import com.yonyou.iuap.system.entity.SystemRole;
import com.yonyou.iuap.system.entity.SystemRoleExample;
import com.yonyou.iuap.system.mapper.sub.SubRolePermissionRelationMapper;
import com.yonyou.iuap.system.mapper.sub.SubSystemRoleMapper;
import com.yonyou.iuap.system.service.SystemRoleService;

/**
 * 角色管理
 * @author sangw
 *
 */
@Service("systemRoleService")
public class SystemRoleServiceImple implements SystemRoleService {

	
	@Autowired
	SubSystemRoleMapper systemRoleMapper;
	
	@Autowired
	private SubRolePermissionRelationMapper rolePermissionRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective (SystemRole record) throws Exception {
		record.setCreateTime(new Date());
		systemRoleMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<SystemRole> queryAllSalesCustomers()throws Exception {
		SystemRoleExample example = new SystemRoleExample();
		return systemRoleMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(SystemRole record)throws Exception {
		systemRoleMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(SystemRole systemRole)throws Exception {
		//删除角色下的权限
		RolePermissionRelationExample rolePermissionRelationExample = new RolePermissionRelationExample();
		rolePermissionRelationExample.createCriteria().andRoleIdEqualTo(systemRole.getRoleId());
		rolePermissionRelationMapper.deleteByExample(rolePermissionRelationExample);
		//删除角色
		SystemRoleExample example = new SystemRoleExample();
		example.createCriteria().andRoleIdEqualTo(systemRole.getRoleId());
		systemRoleMapper.deleteByExample(example);
	}
	
}
