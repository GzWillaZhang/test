package com.util;

import java.util.Iterator;

/**
 * 工具类，提供公共方法
 * 
 * @author willa_zhang
 * @date 2018年7月28日
 *
 */
public class Utils {
	
	/**
	 * 打印集合
	 * @param it Iterator对象
	 */
	public static void printCollections(Iterator it) {
		if(it==null) {
			throw new IllegalArgumentException("参数集合不能为null");
		}else{
			System.out.println("-------------------打印列表--------------");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("-------------------打印结束--------------");
		}
	}
	
	/**
	 * 判断fullStr是否包含str
	 * @param fullStr
	 * @param str
	 * @return
	 */
	public static boolean isContainStr(String fullStr,String str) {
		if(fullStr==null) {
			throw new IllegalArgumentException("被检查字符串不能为null");
		}else{
			return fullStr.contains(str);
		}
	}
}
