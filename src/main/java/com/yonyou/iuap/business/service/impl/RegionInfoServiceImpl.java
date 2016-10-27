package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.business.entity.RegionInfoExample;
import com.yonyou.iuap.business.mapper.sub.SubRegionInfoMapper;
import com.yonyou.iuap.business.service.RegionInfoService;

/**
 * 大区表
 * @author sangw
 *
 */
@Service("regionInfoService")
public class RegionInfoServiceImpl implements RegionInfoService{

	@Autowired
	private SubRegionInfoMapper regionInfoMapper;
	

	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(RegionInfo record)throws Exception{
		regionInfoMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<RegionInfo> selectByExample()throws Exception{
		RegionInfoExample example = new RegionInfoExample();
		return regionInfoMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(RegionInfo record)throws Exception {
		regionInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(RegionInfo record)throws Exception {
		RegionInfoExample example = new RegionInfoExample();
		example.createCriteria().andRegionIdEqualTo(record.getRegionId());
//		example.createCriteria().andRegionIdIn(values);
		regionInfoMapper.deleteByExample(example);
	}
	
}
