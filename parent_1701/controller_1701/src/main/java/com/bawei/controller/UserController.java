package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.entity.User;
import com.bawei.service.UserService;
import com.bawei.util.PageModel;
//  Contrller 
@Controller
public class UserController {
	
	@Autowired
	private UserService us;
	
	
	@RequestMapping("page.do")
	public   String  page(String  cpage,Model model){
		PageModel  pm  = new PageModel(cpage,us.count(),2);
		List<User> list   = us.findPage(pm);
		model.addAttribute("list", list);
		model.addAttribute("pm",pm);
		return "page";
	}
}
