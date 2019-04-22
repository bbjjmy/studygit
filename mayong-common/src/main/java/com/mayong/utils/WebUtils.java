package com.mayong.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtils {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值
	public Object getString(HttpServletRequest request, String name, String defaultValue){
		String parameter = request.getParameter("name");
		if (parameter.isEmpty()) {
			return defaultValue;
		}else{
			if (parameter.equals("") || parameter.equals(" ") || parameter==null) {
				return defaultValue;
			}
		}
		
		return parameter;
	    //实现代码
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name, Integer defaultValue){
		String parameter = request.getParameter("name");
		if (parameter.isEmpty()) {
			return defaultValue;
			
		}else{
			if (parameter.equals("") || parameter.equals(" ") || parameter==null) {
				return defaultValue;
			}
		}
	    //实现代码
		return Integer.valueOf(parameter);
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request, String name){
		String parameter = request.getParameter("name");
		if (parameter.isEmpty()) {
			return false;
		}else {
			if (parameter.equals("") || parameter.equals(" ") || parameter==null) {
				return false;
			}
		}
		return true;
	    //实现代码
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String parameter = request.getParameter("name");
		StringBuffer requestURL = request.getRequestURL();
		return requestURL.toString()+parameter;
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(HttpServletRequest request,String s){
	    //实现代码
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (s.equals(cookie)) {
				return cookie.toString();
			}else{
				return null;
			}
		}
		return null;
	}


}
