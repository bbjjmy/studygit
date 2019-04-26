package com.mayong.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtils {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值
	public Object getString(HttpServletRequest request, String name, String defaultValue){
		//实现代码
		String value  = request.getParameter(name);
		if(value==null){
			return defaultValue;
		}
		return value;
	    //实现代码
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name, Integer defaultValue){
		//实现代码
		Object value   = request.getParameter(name);
		if(value==null  ||  !(value instanceof  Integer)){
			return defaultValue;
		}
		return (int)value;
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request, String name){
		//实现代码
		Object value = request.getParameter(name);
		if(value==null  ||  !(value instanceof  Boolean)){
			return false;
		}
		return (boolean)value;
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		StringBuffer url  = request.getRequestURL();
	    //实现代码
		return url.toString();
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(HttpServletRequest request,String cookieName){
	    //实现代码
		Cookie[] cs  = request.getCookies();
		if(cs!=null && cs.length>0){
			for(Cookie c:cs){
				if(c.getName().equals(cookieName)){
					return c.getValue();
				}
			}
		}
	   //  如果没有对应的 cookName的名字 返回null
		return null;
	}


}
