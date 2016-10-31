package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.entity.BranchcompanyProjectRelation;
import com.yonyou.iuap.business.entity.BranchcompanyProjectRelationExample;
import com.yonyou.iuap.business.mapper.sub.SubBranchcompanyProjectRelationMapper;
import com.yonyou.iuap.business.service.BranchcompanyProjectRelationService;

@Service("branchcompanyProjectRelationService")
public class BranchcompanyProjectRelationServiceImpl implements BranchcompanyProjectRelationService{
	
	@Autowired
	private SubBranchcompanyProjectRelationMapper branchcompanyProjectRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(BranchcompanyProjectRelation record)throws Exception{
		branchcompanyProjectRelationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<BranchcompanyProjectRelation> selectByExample()throws Exception{
		BranchcompanyProjectRelationExample example = new BranchcompanyProjectRelationExample();
		return branchcompanyProjectRelationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(BranchcompanyProjectRelation record)throws Exception {
		branchcompanyProjectRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(BranchcompanyProjectRelation customerInfo)throws Exception {
		BranchcompanyProjectRelationExample example = new BranchcompanyProjectRelationExample();
		example.createCriteria().andBranchIdEqualTo(customerInfo.getBranchId());
//		example.createCriteria().andBranchIdIn(values);
		branchcompanyProjectRelationMapper.deleteByExample(example);
	}
	
	
}
