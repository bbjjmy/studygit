package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.User;

public interface UserDao {
	//��ҳ 
	public   List<User>  findPage(@Param("from")int from,@Param("pageSize")int pageSize);
	//���� 
	public  int count();
}
