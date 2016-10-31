package com.yonyou.iuap.business.mapper;

import com.yonyou.iuap.business.entity.RegionInfo;
import com.yonyou.iuap.business.entity.RegionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionInfoMapper {
    int countByExample(RegionInfoExample example);

    int deleteByExample(RegionInfoExample example);

    int deleteByPrimaryKey(Long regionId);

    int insert(RegionInfo record);

    int insertSelective(RegionInfo record);

    List<RegionInfo> selectByExample(RegionInfoExample example);

    RegionInfo selectByPrimaryKey(Long regionId);

    int updateByExampleSelective(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByExample(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByPrimaryKeySelective(RegionInfo record);

    int updateByPrimaryKey(RegionInfo record);
}