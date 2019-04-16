package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.User;

public interface UserDao {
	//·ÖÒ³ 
	public   List<User>  findPage(@Param("from")int from,@Param("pageSize")int pageSize);
	//ÌõÊı 
	public  int count();
}
