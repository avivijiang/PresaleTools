package com.yonyou.iuap.common.web;

import com.yonyou.iuap.common.entity.ResultDTO;

public class BaseController {

	protected ResultDTO success(Object obj) {
		ResultDTO dto = new ResultDTO();
		dto.setCode("200");
		dto.setMessage("success");
		dto.setData(obj);
		dto.setSuccess(Boolean.TRUE);
		return dto;
	}

	protected ResultDTO error(String message) {
		ResultDTO dto = new ResultDTO();
		dto.setCode("500");
		dto.setMessage(message);
		dto.setSuccess(Boolean.FALSE);
		return dto;
	}

}
