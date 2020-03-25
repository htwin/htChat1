package com.ht.springboot.mapper;

import com.ht.springboot.pojo.User;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
