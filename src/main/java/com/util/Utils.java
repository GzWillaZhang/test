package com.util;

import java.util.Iterator;

/**
 * �����࣬�ṩ��������
 * 
 * @author willa_zhang
 * @date 2018��7��28��
 *
 */
public class Utils {
	
	/**
	 * ��ӡ����
	 * @param it Iterator����
	 */
	public static void printCollections(Iterator it) {
		if(it==null) {
			throw new IllegalArgumentException("�������ϲ���Ϊnull");
		}else{
			System.out.println("-------------------��ӡ�б�--------------");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("-------------------��ӡ����--------------");
		}
	}
	
	/**
	 * �ж�fullStr�Ƿ����str
	 * @param fullStr
	 * @param str
	 * @return
	 */
	public static boolean isContainStr(String fullStr,String str) {
		if(fullStr==null) {
			throw new IllegalArgumentException("������ַ�������Ϊnull");
		}else{
			return fullStr.contains(str);
		}
	}
}
