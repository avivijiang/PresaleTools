package com.yonyou.iuap.system.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.iuap.system.entity.SystemRole;
import com.yonyou.iuap.system.entity.SystemRoleExample;
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
	
	/**
	 * 添加
	 * @param record
	 */
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
	public void updateByPrimaryKeySelective(SystemRole record)throws Exception {
		systemRoleMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	public void deleteByExample(SystemRole systemRole)throws Exception {
		SystemRoleExample example = new SystemRoleExample();
		example.createCriteria().andRoleIdEqualTo(systemRole.getRoleId());
//		example.createCriteria().andRoleIdIn(values);
		systemRoleMapper.deleteByExample(example);
	}
	
}
