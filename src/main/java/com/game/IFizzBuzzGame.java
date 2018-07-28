package com.game;

import java.util.List;

/**
 * ������Ϸ��
 * @author willa_zhang
 * @date 2018��7��28��
 *
 */
public interface IFizzBuzzGame {

	/**
	 * ���maxNum���ڵĺ���<br/>
	 * 	      �����ֱ�3��������Fizz<br/>
	 *    �����ֱ�5��������Buzz<br/>             
	 *    ������ͬʱ��3��5��������FizzBuzz<br/>
	 *    ����ֱ�Ӻ�����
	 *    
	 * @param maxNum �����
	 * @return maxNum���ڵĺ����������
	 */
	public List<String> getFizzBuzzNumsList(int maxNum);
	
	/**
	 * �¹��򣬻��maxNum���ڵĺ���<br/>
	 * 	      �����ֱ�3���������3����Fizz<br/>
	 *    �����ֱ�5���������5����Buzz<br/>             
	 *    ������ͬʱ��3��5��������FizzBuzz<br/>
	 *    ����ֱ�Ӻ�����
	 *    
	 * @param maxNum �����
	 * @return maxNum���ڵĺ����������
	 */
	public List<String> getFizzBuzzNumsListByNewRule(int maxNum);
}
