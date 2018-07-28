package com.game;

import java.util.List;

/**
 * 喊数游戏类
 * @author willa_zhang
 * @date 2018年7月28日
 *
 */
public interface IFizzBuzzGame {

	/**
	 * 获得maxNum以内的喊数<br/>
	 * 	      当数字被3整除，则喊Fizz<br/>
	 *    当数字被5整除，则喊Buzz<br/>             
	 *    当数字同时被3和5整除，则喊FizzBuzz<br/>
	 *    否则直接喊数字
	 *    
	 * @param maxNum 最大喊数
	 * @return maxNum以内的喊数结果集合
	 */
	public List<String> getFizzBuzzNumsList(int maxNum);
	
	/**
	 * 新规则，获得maxNum以内的喊数<br/>
	 * 	      当数字被3整除或包含3，则喊Fizz<br/>
	 *    当数字被5整除或包含5，则喊Buzz<br/>             
	 *    当数字同时被3和5整除，则喊FizzBuzz<br/>
	 *    否则直接喊数字
	 *    
	 * @param maxNum 最大喊数
	 * @return maxNum以内的喊数结果集合
	 */
	public List<String> getFizzBuzzNumsListByNewRule(int maxNum);
}
