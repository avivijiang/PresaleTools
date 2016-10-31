package com.yonyou.iuap.business.dto;

public class PageList {

	private int pageIndex;
	
	private int pageSize;
	
	private int pageNum;
	
	private Object palist;

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

	public Object getPalist() {
		return palist;
	}

	public void setPalist(Object palist) {
		this.palist = palist;
	}
	
	
	
}
