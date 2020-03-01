package com.imooc.mapper;

import java.util.List;

import com.imooc.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}