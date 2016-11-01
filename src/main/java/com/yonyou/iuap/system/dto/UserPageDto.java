package com.yonyou.iuap.system.dto;

import java.util.ArrayList;
import java.util.List;

import com.yonyou.iuap.system.entity.UserInfoVO;

public class UserPageDto {

	private int pageIndex;
	private int pageSize;
	private int pageNum;
	private List<UserInfoVO> listUserInfo = new ArrayList<UserInfoVO>();
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public List<UserInfoVO> getListUserInfo() {
		return listUserInfo;
	}
	public void setListUserInfo(List<UserInfoVO> listUserInfo) {
		this.listUserInfo = listUserInfo;
	}
	
	
}
