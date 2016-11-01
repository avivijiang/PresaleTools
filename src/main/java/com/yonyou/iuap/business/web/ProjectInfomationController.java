package com.yonyou.iuap.business.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.iuap.auth.shiro.AuthConstants;
import com.yonyou.iuap.business.dto.PageList;
import com.yonyou.iuap.business.dto.ProjectDetailDto;
import com.yonyou.iuap.business.dto.ProjectFollowRecordDto;
import com.yonyou.iuap.business.dto.ProjectInformationDto;
import com.yonyou.iuap.business.service.ProjectFollowService;
import com.yonyou.iuap.business.service.ProjectInformationService;
import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.utils.CookieUtil;

/**
 * 项目
 * 
 * @author sangw
 *
 */
@Controller
@RequestMapping(value = "/project")
public class ProjectInfomationController extends BaseController {

	@Autowired
	private ProjectInformationService projectInformationService;
	
	@Autowired
	private ProjectFollowService projectFollowService;

	/**
	 * 分页
	 * 
	 * @param request
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public ResultDTO query(HttpServletRequest request,
			@RequestParam(value = "pageIndex", defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "regionId", defaultValue = "1") long regionId) {
		try {
			PageList pageList = projectInformationService.querPage(pageNumber, pageSize, regionId);
			return super.success(pageList);
		} catch (Exception e) {
			logger.error("查询出错!");
			return super.error("查询出错!");
		}
	}

	/**
	 * 新增
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResultDTO create(HttpServletRequest request, @RequestBody ProjectInformationDto dto) {
		ResultDTO resultDTO = new ResultDTO();
		try {
			projectInformationService.insertProjectInformation(dto);
			resultDTO = super.successNoData();
		} catch (Exception e) {
			return super.error("保存失败！");
		}
		return resultDTO;
	}

	/**
	 * 修改
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResultDTO update(HttpServletRequest request, @RequestBody ProjectInformationDto dto) {
		ResultDTO resultDTO = new ResultDTO();
		try {
			projectInformationService.updateProjectInformation(dto);
			resultDTO = super.successNoData();
		} catch (Exception e) {
			return super.error("保存失败！");
		}
		return resultDTO;
	}

	/**
	 * 删除
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public ResultDTO delete(HttpServletRequest request,
			@RequestParam(value = "projectId", defaultValue = "0") long projectId) {
		ResultDTO resultDTO = new ResultDTO();
		try {
			if(projectId!=0){
				projectInformationService.deleteProjectInformation(projectId);
				resultDTO = super.successNoData();
			}else{
				resultDTO = super.errorData("请选择要删除的项目");
			}
		} catch (Exception e) {
			return super.error("删除失败！");
		}
		return resultDTO;
	}
	
	/**
	 * 查询详情
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ResultDTO detail(HttpServletRequest request,
			@RequestParam(value = "projectId", defaultValue = "0") long projectId) {
		ResultDTO resultDTO = new ResultDTO();
		try {
			if(projectId!=0){
				ProjectDetailDto projectDetailDto = projectInformationService.queryDetail(projectId);
				resultDTO = super.success(projectDetailDto);
			}else{
				resultDTO = super.errorData("请选择项目");
			}
		} catch (Exception e) {
			return super.error("查询失败！");
		}
		return resultDTO;
	}
	
	/**
	 * 添加跟进记录
	 * @param request
	 * @param dto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addRecord", method = RequestMethod.POST)
	public ResultDTO addRecord(HttpServletRequest request,@RequestBody ProjectFollowRecordDto dto){
		try {
			//获取当前登录人的登录名
			String usercode = CookieUtil.findCookieValue(request.getCookies(),AuthConstants.PARAM_USERNAME);
			String message = projectFollowService.insertSelective(dto, usercode);
			if(!StringUtils.isNotBlank(message)){
				return super.error(message);
			}
			return successNoData();
		} catch (Exception e) {
			return super.error("系统错误");
		}
	}

}
