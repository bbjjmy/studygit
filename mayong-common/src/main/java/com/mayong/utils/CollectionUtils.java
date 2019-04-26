package com.mayong.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Collection c) {
		if(c!=null && c.size()>0){
			return true;
		}
		return false;
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<Object,Object> map) {
		if(map!=null && map.size()>0){
			return true;
		}
		return false;
	}
}
