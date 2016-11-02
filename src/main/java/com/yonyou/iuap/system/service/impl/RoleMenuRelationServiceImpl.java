package com.yonyou.iuap.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.system.entity.RoleMenuRelation;
import com.yonyou.iuap.system.entity.RoleMenuRelationExample;
import com.yonyou.iuap.system.entity.SystemMenu;
import com.yonyou.iuap.system.mapper.sub.SubRoleMenuRelationMapper;
import com.yonyou.iuap.system.mapper.sub.SubSystemMenuMapper;
import com.yonyou.iuap.system.service.RoleMenuRelationService;

/**
 * 角色与菜单关系
 * @author sangw
 *
 */
@Service("roleMenuRelationService")
public class RoleMenuRelationServiceImpl implements RoleMenuRelationService {
	
	@Autowired
	private SubRoleMenuRelationMapper roleMenuRelationMapper;
	
	@Autowired
	private SubSystemMenuMapper systemMenuMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(RoleMenuRelation record)throws Exception{
		roleMenuRelationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<RoleMenuRelation> selectByExample()throws Exception{
		RoleMenuRelationExample example = new RoleMenuRelationExample();
		return roleMenuRelationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(RoleMenuRelation record)throws Exception {
		roleMenuRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(RoleMenuRelation roleMenuRelation)throws Exception {
		RoleMenuRelationExample example = new RoleMenuRelationExample();
		example.createCriteria().andRelationIdEqualTo(roleMenuRelation.getRelationId());
		roleMenuRelationMapper.deleteByExample(example);
	}
	/**
	 * 根据用户登录名查询菜单
	 * @param loginName
	 * @return
	 * @throws Exception
	 */
	public List<SystemMenu> queryRoleMenu(String loginName)throws Exception {
		return systemMenuMapper.queryRoleMenu(loginName);
	}
	
}
