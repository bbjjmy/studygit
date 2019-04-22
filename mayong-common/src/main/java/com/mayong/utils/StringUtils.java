package com.mayong.utils;

public class StringUtils {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src) {
		if (src.isEmpty()) {
			return false;
		}else{
			if (src.equals("") || src.equals(null)) {
				return false;
			} else {
				return true;
			}
		}
		
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasText(String src) {
		if (src.isEmpty()) {
			return false;
		}else {
			if (src.equals("") || src==null || src ==" ") {
				return false;
			} else {
				return true;
			}
		}
		
	}
	//方法4：判断是否手机 (5分)
	public boolean isMobile(String src) {
		String reg1 = "(1)[0-9]{10}";
		if (src.matches(reg1)) {
			return true;
		} else {
			return false;
		}
	}
	//方法4：判断是否为邮箱 (5分)
	public boolean isEmail(String src) {
		String reg1 = "\\w+@\\w+.(com|cn|con|com.cn)";
		if (src.matches(reg1)) {
			return true;
		} else {
			return false;
		}
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public boolean reverse(String src) {
		char[] srcc = new char[src.length()];
		for (int i = 0; i < src.length(); i++) {
			srcc[src.length()-i-1] = src.charAt(i);
		}
		System.out.println(srcc);
		return false;
	}
	
}
