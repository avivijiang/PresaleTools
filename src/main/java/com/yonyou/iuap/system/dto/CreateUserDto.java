package com.yonyou.iuap.system.dto;

public class CreateUserDto {

	private String loginName;//登录名 邮箱
	
	private String name;//姓名
	
	private String password;//密码
	
	private String tel;//电话
	
	private Long[] roleIds;//角色主键
	
	private Long[] regionIds;//大区主键

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}

	public Long[] getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(Long[] regionIds) {
		this.regionIds = regionIds;
	}
	
	
	
}
