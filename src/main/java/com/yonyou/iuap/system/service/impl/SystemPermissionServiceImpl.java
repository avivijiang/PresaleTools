package com.yonyou.iuap.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.system.entity.SystemPermission;
import com.yonyou.iuap.system.entity.SystemPermissionExample;
import com.yonyou.iuap.system.mapper.sub.SubSystemPermissionMapper;
import com.yonyou.iuap.system.service.SystemPermissionService;

/**
 * 权限管理
 * @author sangw
 *
 */
@Service("systemPermissionService")
public class SystemPermissionServiceImpl implements SystemPermissionService{
	
	@Autowired
	SubSystemPermissionMapper systemPermissionMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(SystemPermission record)throws Exception{
		systemPermissionMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<SystemPermission> selectByExample()throws Exception{
		SystemPermissionExample example = new SystemPermissionExample();
		return systemPermissionMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(SystemPermission record)throws Exception {
		systemPermissionMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(SystemPermission systemPermission)throws Exception {
		SystemPermissionExample example = new SystemPermissionExample();
		example.createCriteria().andPermissionIdEqualTo(systemPermission.getPermissionId());
//		example.createCriteria().andPermissionIdIn(values);
		systemPermissionMapper.deleteByExample(example);
	}
	

}
