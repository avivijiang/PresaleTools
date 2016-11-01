package com.yonyou.iuap.system.entity;

import java.util.Date;
import java.util.List;

import com.yonyou.iuap.business.entity.RegionInfo;

public class UserInfoVO {
	
	private Long id;//人员主键
	
	private String name;//姓名
	
	private String loginName;//登录名（邮箱）
	
	private String tel;//电话
	
//	private Long[] roleIds;//角色主键数组
//	private String roles;//角色名称字符串
//	private Long[] regionIds;//大区主键数组
//	private String regions;//大区名称串
	
	private Date createTime;//创建时间
	
	private List<SystemRole> listSystemRole;//所选的角色
	
	private List<RegionInfo> listRegionInfo;//所管辖的大区

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<SystemRole> getListSystemRole() {
		return listSystemRole;
	}

	public void setListSystemRole(List<SystemRole> listSystemRole) {
		this.listSystemRole = listSystemRole;
	}

	public List<RegionInfo> getListRegionInfo() {
		return listRegionInfo;
	}

	public void setListRegionInfo(List<RegionInfo> listRegionInfo) {
		this.listRegionInfo = listRegionInfo;
	}
	
	
	

}
