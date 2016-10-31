package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.entity.RegionBranchRelation;
import com.yonyou.iuap.business.entity.RegionBranchRelationExample;
import com.yonyou.iuap.business.mapper.sub.SubRegionBranchRelationMapper;
import com.yonyou.iuap.business.service.RegionBranchRelationService;

@Service("regionBranchRelationService")
public class RegionBranchRelationServiceImpl implements RegionBranchRelationService{

	@Autowired
	private SubRegionBranchRelationMapper regionBranchRelationMapper;
	
	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(RegionBranchRelation record)throws Exception{
		regionBranchRelationMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<RegionBranchRelation> selectByExample()throws Exception{
		RegionBranchRelationExample example = new RegionBranchRelationExample();
		return regionBranchRelationMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(RegionBranchRelation record)throws Exception {
		regionBranchRelationMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(RegionBranchRelation record)throws Exception {
		RegionBranchRelationExample example = new RegionBranchRelationExample();
		example.createCriteria().andRegionIdEqualTo(record.getRegionId());
//		example.createCriteria().andRegionIdIn(values);
		regionBranchRelationMapper.deleteByExample(example);
	}
	
}
