package com.mayong.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(List<Object> list) {
		if (list.isEmpty()) {
			return false;
		}else {
			for (Object object : list) {
				if (object.equals("") || object.equals(" ") ||object==null) {
					return false;
				}
			}
			return true;
		}
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<Object,Object> map) {
		if (map.isEmpty()) {
			return false;
		}else {
			Set<Object> keySet = map.keySet();
			for (Object object : keySet) {
				if (object.equals("") || object.equals(" ") ||object==null) {
					return false;
				}else {
					Collection<Object> values = map.values();
					if (object.equals("") || object.equals(" ") ||object==null) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
