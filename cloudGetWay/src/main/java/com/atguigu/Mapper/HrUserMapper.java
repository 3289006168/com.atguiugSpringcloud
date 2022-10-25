package com.atguigu.Mapper;

import com.atguigu.Entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HrUserMapper {
    UserInfo getByName(@Param("name") String name);

}
