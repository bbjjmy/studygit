package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bawei.dao.UserDao;
import com.bawei.entity.User;
import com.bawei.util.PageModel;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Override
	public List<User> findPage(PageModel pm) {
		List<User> list = dao.findPage(pm.getPageRecord(), pm.getPageSize());
		return list;
	}

	@Override
	public int count() {
		return dao.count();
	}
}
