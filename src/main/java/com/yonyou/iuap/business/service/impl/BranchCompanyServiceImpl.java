package com.yonyou.iuap.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.iuap.business.entity.BranchCompany;
import com.yonyou.iuap.business.entity.BranchCompanyExample;
import com.yonyou.iuap.business.mapper.sub.SubBranchCompanyMapper;
import com.yonyou.iuap.business.service.BranchCompanyService;

/**
 * 分公司
 * @author sangw
 *
 */
@Service("branchCompanyService")
public class BranchCompanyServiceImpl implements BranchCompanyService{
	
	@Autowired
	private SubBranchCompanyMapper branchCompanyMapper;

	/**
	 * 添加
	 * @param record
	 */
	@Transactional
	public void insertSelective(BranchCompany record)throws Exception{
		branchCompanyMapper.insertSelective(record);
	}
	
	/**
	 * 查询
	 * @param example
	 * @return
	 */
	public List<BranchCompany> selectByExample()throws Exception{
		BranchCompanyExample example = new BranchCompanyExample();
		return branchCompanyMapper.selectByExample(example);
	}
	
	/**
	 * 修改
	 * @param record
	 */
	@Transactional
	public void updateByPrimaryKeySelective(BranchCompany record)throws Exception {
		branchCompanyMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除
	 * @param example
	 */
	@Transactional
	public void deleteByExample(BranchCompany customerInfo)throws Exception {
		BranchCompanyExample example = new BranchCompanyExample();
		example.createCriteria().andBranchIdEqualTo(customerInfo.getBranchId());
//		example.createCriteria().andBranchIdIn(values);
		branchCompanyMapper.deleteByExample(example);
	}
	
}
