package com.bawei.service;

import java.util.List;

import com.bawei.entity.User;
import com.bawei.util.PageModel;

public interface UserService {
	public  List<User>  findPage(PageModel pm);
	public   int  count();
}
