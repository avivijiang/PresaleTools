package com.yonyou.iuap.system.mapper;

import com.yonyou.iuap.system.entity.SystemUserInfo;
import com.yonyou.iuap.system.entity.SystemUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserInfoMapper {
    int countByExample(SystemUserInfoExample example);

    int deleteByExample(SystemUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemUserInfo record);

    int insertSelective(SystemUserInfo record);

    List<SystemUserInfo> selectByExample(SystemUserInfoExample example);

    SystemUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemUserInfo record, @Param("example") SystemUserInfoExample example);

    int updateByExample(@Param("record") SystemUserInfo record, @Param("example") SystemUserInfoExample example);

    int updateByPrimaryKeySelective(SystemUserInfo record);

    int updateByPrimaryKey(SystemUserInfo record);
}