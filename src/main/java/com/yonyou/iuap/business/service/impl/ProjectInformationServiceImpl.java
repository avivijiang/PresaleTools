package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.dto.PageList;
import com.yonyou.iuap.business.dto.ProjectDetailDto;
import com.yonyou.iuap.business.dto.ProjectInformationDto;
import com.yonyou.iuap.business.entity.BranchcompanyProjectRelation;
import com.yonyou.iuap.business.entity.BranchcompanyProjectRelationExample;
import com.yonyou.iuap.business.entity.CustomerProjectRelation;
import com.yonyou.iuap.business.entity.CustomerProjectRelationExample;
import com.yonyou.iuap.business.entity.ProjectFollow;
import com.yonyou.iuap.business.entity.ProjectFollowExample;
import com.yonyou.iuap.business.entity.ProjectInfoVO;
import com.yonyou.iuap.business.entity.ProjectInformation;
import com.yonyou.iuap.business.entity.ProjectInformationExample;
import com.yonyou.iuap.business.mapper.sub.SubBranchcompanyProjectRelationMapper;
import com.yonyou.iuap.business.mapper.sub.SubCustomerProjectRelationMapper;
import com.yonyou.iuap.business.mapper.sub.SubProjectFollowMapper;
import com.yonyou.iuap.business.mapper.sub.SubProjectInformationMapper;
import com.yonyou.iuap.business.service.ProjectInformationService;

/**
 * 项目信息
 * @author sangw
 *
 */
@Service("projectInformationService")
public class ProjectInformationServiceImpl implements ProjectInformationService {

	@Autowired
	private SubProjectInformationMapper projectInformationMapper;
	
	@Autowired
	private SubBranchcompanyProjectRelationMapper branchcompanyProjectRelationMapper;
	
	@Autowired
	private SubProjectFollowMapper projectFollowMapper;
	
	@Autowired
	private SubCustomerProjectRelationMapper customerProjectRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(ProjectInformation record)throws Exception{
		projectInformationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<ProjectInformation> selectByExample()throws Exception{
		ProjectInformationExample example = new ProjectInformationExample();
		return projectInformationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(ProjectInformation record)throws Exception {
		projectInformationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(ProjectInformation record)throws Exception {
		ProjectInformationExample example = new ProjectInformationExample();
		example.createCriteria().andProjectIdEqualTo(record.getProjectId());
//		example.createCriteria().andProjectIdIn(values);
		projectInformationMapper.deleteByExample(example);
	}
	
	/**
	 * 分页
	 */
	public PageList querPage(int index,int pageSize,long regionId)throws Exception {
		PageList pageList = new PageList();
		List<ProjectInfoVO> list = projectInformationMapper.queryPage(index, pageSize,regionId);
		ProjectInformationExample example = new ProjectInformationExample();
		int pageNum = projectInformationMapper.countByExample(example);
		pageList.setPageIndex(index);
		pageList.setPalist(list);
		pageList.setPageSize(list.size());
		pageList.setPageNum(pageNum);
		return pageList;
	}
	
	/**
	 * 新增
	 */
	@Transactional
	public void insertProjectInformation(ProjectInformationDto dto)throws Exception{
		ProjectInformation record = new ProjectInformation();
		BeanUtils.copyProperties(dto, record);
		if(record!=null){
			//新增项目信息
			projectInformationMapper.insertSelective(record);
			//新增项目与分公司关系
			BranchcompanyProjectRelation brecord = new BranchcompanyProjectRelation();
			brecord.setBranchId(dto.getBranchId());
			brecord.setProjectId(record.getProjectId());
			branchcompanyProjectRelationMapper.insertSelective(brecord);
			//新增项目与客户关系
			CustomerProjectRelation crecord = new CustomerProjectRelation();
			crecord.setCustomerId(dto.getCustomerId());
			crecord.setProjectId(record.getProjectId());
			customerProjectRelationMapper.insertSelective(crecord);
		}
	}
	
	/**
	 * 修改项目信息
	 * @param dto
	 * @throws Exception
	 */
	@Transactional
	public void updateProjectInformation(ProjectInformationDto dto)throws Exception{
		ProjectInformation record = new ProjectInformation();
		BeanUtils.copyProperties(dto, record);
		if(record.getProjectId()!=0){
			//修改项目信息
			projectInformationMapper.updateByPrimaryKeySelective(record);
			//删除项目与分公司关系
			BranchcompanyProjectRelationExample example = new BranchcompanyProjectRelationExample();
			example.createCriteria().andProjectIdEqualTo(record.getProjectId());
			branchcompanyProjectRelationMapper.deleteByExample(example);
			//增加项目与分公司关系
			BranchcompanyProjectRelation brecord = new BranchcompanyProjectRelation();
			brecord.setBranchId(dto.getBranchId());
			brecord.setProjectId(record.getProjectId());
			branchcompanyProjectRelationMapper.insertSelective(brecord);
			//删除项目与客户关系
			CustomerProjectRelationExample customerProjectRelationExample = new CustomerProjectRelationExample();
			customerProjectRelationExample.createCriteria().andProjectIdEqualTo(record.getProjectId());
			customerProjectRelationMapper.deleteByExample(customerProjectRelationExample);
			//增加项目与客户关系
			CustomerProjectRelation crecord = new CustomerProjectRelation();
			crecord.setCustomerId(dto.getCustomerId());
			crecord.setProjectId(record.getProjectId());
			customerProjectRelationMapper.insertSelective(crecord);
		}
	}
	
	/**
	 * 删除项目
	 * @param projectId
	 * @throws Exception
	 */
	@Transactional
	public void deleteProjectInformation(Long projectId)throws Exception{
		//删除项目
		projectInformationMapper.deleteByPrimaryKey(projectId);
		//删除项目与分公司关系
		BranchcompanyProjectRelationExample example = new BranchcompanyProjectRelationExample();
		example.createCriteria().andProjectIdEqualTo(projectId);
		branchcompanyProjectRelationMapper.deleteByExample(example);
		//删除项目进度
		ProjectFollowExample projectFollowExample = new ProjectFollowExample();
		projectFollowExample.createCriteria().andProjectIdEqualTo(projectId);
		projectFollowMapper.deleteByExample(projectFollowExample);
		//删除项目与客户关系
		CustomerProjectRelationExample customerProjectRelationExample = new CustomerProjectRelationExample();
		customerProjectRelationExample.createCriteria().andProjectIdEqualTo(projectId);
		customerProjectRelationMapper.deleteByExample(customerProjectRelationExample);
	}
	
	/**
	 * 查询详情
	 * @param projectId
	 * @return
	 * @throws Exception
	 */
	public ProjectDetailDto queryDetail(Long projectId)throws Exception{
		ProjectDetailDto dto = new ProjectDetailDto();
		//查询
		ProjectInfoVO projectInfoVO = projectInformationMapper.queryByProjectId(projectId);
		ProjectFollowExample example = new ProjectFollowExample();
		example.createCriteria().andProjectIdEqualTo(projectId);
		//查询跟进流程
		List<ProjectFollow> list = projectFollowMapper.selectByExample(example);
		dto.setListProjectFollow(list);
		dto.setProjectInfoVO(projectInfoVO);
		return dto;
	}
	
	
	
	/* 校验数据 */
	public String checkData(ProjectInformationDto dto){
		if(dto!=null){
			
		}
		return null;
	}
	
}
