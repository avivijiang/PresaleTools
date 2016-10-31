package com.yonyou.iuap.common.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yonyou.iuap.common.entity.ResultDTO;

public class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected ResultDTO success(Object obj) {
		ResultDTO dto = new ResultDTO();
		dto.setCode("200");
		dto.setMessage("success");
		dto.setData(obj);
		dto.setSuccess(Boolean.TRUE);
		return dto;
	}
	
	protected ResultDTO success() {
		return this.success(null);
	}
	
	protected ResultDTO successNoData(Object obj) {
		ResultDTO dto = new ResultDTO();
		dto.setCode("200");
		dto.setMessage("success");
		dto.setData("");
		dto.setSuccess(Boolean.TRUE);
		return dto;
	}
	
	protected ResultDTO successNoData(){
		return this.successNoData(null);
	}

	protected ResultDTO error(String message) {
		ResultDTO dto = new ResultDTO();
		dto.setCode("500");
		dto.setMessage(message);
		dto.setSuccess(Boolean.FALSE);
		return dto;
	}

	protected ResultDTO error() {
		return this.error(null);
	}
	
	protected ResultDTO errorData(String message){
		ResultDTO dto = new ResultDTO();
		dto.setCode("401");
		dto.setMessage(message);
		dto.setSuccess(Boolean.FALSE);
		return dto;
	}
	
	protected ResultDTO errorData() {
		return this.errorData(null);
	}

}
