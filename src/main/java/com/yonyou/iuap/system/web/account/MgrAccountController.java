package com.yonyou.iuap.system.web.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.beanvalidator.BeanValidators;
import org.springside.modules.web.Servlets;

import com.yonyou.iuap.common.entity.ResultDTO;
import com.yonyou.iuap.common.web.BaseController;
import com.yonyou.iuap.system.dto.CreateUserDto;
import com.yonyou.iuap.system.dto.UserPageDto;
import com.yonyou.iuap.system.entity.MgrUser;
import com.yonyou.iuap.system.service.AccountService;
import com.yonyou.iuap.system.service.SystemUserService;

import net.sf.json.JSONObject;

/**
 * 用户管理示例，项目不能直接使用，需要按照自己的需求修改！
 */
@Controller
@RequestMapping(value = "/mgr/account")
public class MgrAccountController extends BaseController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AccountService service;

	@Autowired
	private Validator validator;

	@Autowired
	private SystemUserService systemUserService;

	@RequiresPermissions(value = { "user:query" })
	@RequestMapping(value = "page", method = RequestMethod.GET)
	public @ResponseBody Page<MgrUser> page(@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = "20") int pageSize,
			@RequestParam(value = "sortType", defaultValue = "auto") String sortType, Model model,
			ServletRequest request) {
		Map<String, Object> searchParams = new HashMap<String, Object>();

		// 构造综合的查询条件
		searchParams = Servlets.getParametersStartingWith(request, "search_");

		// 构造分页
		PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);

		// 调用服务查询分页数据
		Page<MgrUser> accountPage = service.getAccountPage(searchParams, pageRequest);

		// 直接返回page对象，springmvc会将数据格式化成json格式
		return accountPage;
	}

	/** 进入新增 */
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public @ResponseBody MgrUser add() {
		MgrUser entity = new MgrUser();
		Long tmpLong = new Long(0);
		entity.setId(tmpLong);
		return entity;
	}

	/** 保存新增 */
	@RequiresPermissions(value = { "user:add" })
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public @ResponseBody Object create(@RequestBody MgrUser entity, HttpServletRequest resq) {
		JSONObject result = new JSONObject();
		try {
			BeanValidators.validateWithException(validator, entity);
			entity = service.saveEntity(entity);
			result.put("msg", "保存成功");
			result.put("flag", 1);
		} catch (Exception e) {
			String msg = "保存失败!";
			if (e instanceof ConstraintViolationException) {
				List<String> vmsg = BeanValidators.extractMessage((ConstraintViolationException) e);
				msg += vmsg.toString();

			}
			result.put("msg", msg);
			result.put("flag", 0);
			logger.error("保存出错!", e);

		}
		return result;
	}

	/**
	 * 进入更新界面
	 * 
	 * @param id
	 * @param model
	 * @return 需要更新的实体的json结构
	 */
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public @ResponseBody MgrUser updateForm(@PathVariable("id") Long id, Model model) {
		MgrUser entity = service.getUser(id);
		return entity;
	}

	/** 保存更新 */
	@RequiresPermissions(value = { "user:update" })
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public @ResponseBody Object update(@RequestBody MgrUser entity, HttpServletRequest resq) {
		JSONObject result = new JSONObject();
		try {
			entity = service.saveEntity(entity);
			result.put("msg", "保存成功");
			result.put("flag", 1);
		} catch (Exception e) {
			result.put("msg", "保存失败");
			result.put("flag", 0);
			logger.error("更新出错!", e);
		}
		return result;
	}

	/**
	 * 删除实体
	 * 
	 * @param id
	 *            删除的标识
	 * @return 是否删除成功
	 */
	@RequiresPermissions(value = { "user:delete" })
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean delete(@PathVariable("id") Long id) {
		try {
			service.deleteUser(id);
		} catch (Exception e) {
			logger.error("delete user error,user id is {}", id, e);
			return false;
		}
		return true;
	}

	/**
	 * 创建分页请求.
	 */
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("title".equals(sortType)) {
			sort = new Sort(Direction.ASC, "title");
		}
		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}

	/** 保存新增 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public @ResponseBody Object add(@RequestBody CreateUserDto dto, HttpServletRequest resq) {
		JSONObject result = new JSONObject();
		try {
			MgrUser mgrUser = new MgrUser();
			BeanUtils.copyProperties(dto, mgrUser);
			mgrUser.setPlainPassword(dto.getPassword());
			mgrUser.setSalt(dto.getPassword());
			mgrUser.setId((long) 0);
			BeanValidators.validateWithException(validator, mgrUser);
			mgrUser = service.saveUser(dto, mgrUser);
			if (mgrUser == null) {
				result.put("message", "保存失败，用户名已存在!");
				result.put("code", "401");
				result.put("success", Boolean.FALSE);
				return result;
			}
			result.put("message", "保存成功");
			result.put("code", "200");
			result.put("success", Boolean.TRUE);
		} catch (Exception e) {
			String msg = "保存失败!";
			if (e instanceof ConstraintViolationException) {
				List<String> vmsg = BeanValidators.extractMessage((ConstraintViolationException) e);
				msg += vmsg.toString();

			}
			result.put("message", msg);
			result.put("code", "500");
			result.put("success", Boolean.FALSE);
			logger.error("保存出错!", e);

		}
		return result;
	}

	/**
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param sortType
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "queryUser", method = RequestMethod.GET)
	public @ResponseBody ResultDTO queryUserInfo(@RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize, Model model, ServletRequest request) {
		try {
			UserPageDto dto = systemUserService.querUserInfoList(pageIndex, pageSize);
			return super.success(dto);
		} catch (Exception e) {
			return super.error("查询错误!");
		}
	}

}
