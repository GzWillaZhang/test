package com.game.test;

import java.util.Iterator;
import java.util.List;

import com.game.IFizzBuzzGame;
import com.game.impl.FizzBuzzGameImpl;
import com.util.Utils;

import junit.framework.TestCase;

/**
 * 测试喊数游戏是否获得期望结果
 * @author willa_zhang
 * @date 2018年7月28日
 *
 */
public class FizzBuzzGameTest extends TestCase {
	final int MAX_NUMBER = 100;
	
	private IFizzBuzzGame fizzBuzzGame;
	
	protected void setUp() {
		fizzBuzzGame = new FizzBuzzGameImpl();
	}
	
	/**
	 * 测试23以内的喊数
	 */
	public void testCountTo23() {
		List<String> numList = fizzBuzzGame.getFizzBuzzNumsList(23);
		assertEquals(23, numList.size());

		String[] expectStrArray = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
								  "11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz",
								  "Fizz","22","23"};
		
		for(int i=0;i<numList.size();i++) {
			assertEquals(expectStrArray[i],numList.get(i));
		}
	}
	
	/**
	 * 测试新规则下23以内的喊数
	 */
	public void testCountTo23ByNewRule() {
		List<String> numList = fizzBuzzGame.getFizzBuzzNumsListByNewRule(23);
		assertEquals(23, numList.size());

		String[] expectStrArray = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
								  "11","Fizz","Fizz","14","FizzBuzz","16","17","Fizz","19","Buzz",
								  "Fizz","22","Fizz"};
		
		for(int i=0;i<numList.size();i++) {
			assertEquals(expectStrArray[i],numList.get(i));
		}
	}
	
	
	/**
	 * 测试MAX_NUMBER以内的喊数
	 */
	public void testCountTo100() {
		List<String> numList = fizzBuzzGame.getFizzBuzzNumsList(MAX_NUMBER);
		assertEquals(MAX_NUMBER, numList.size());
		
		int count = 1;
		Iterator<String> it = numList.iterator();
		for(;it.hasNext();count++) {
			String currentNum = it.next();
			
			if(count%3==0 && count%5==0) {
				assertEquals("FizzBuzz",currentNum);
			}else if(count%3==0) {
				assertEquals("Fizz",currentNum);
			}else if(count%5==0) {
				assertEquals("Buzz",currentNum);
			}else {
				assertEquals(count+"",currentNum);
			}
		}		
	}
	
	/**
	 * 测试新规则下MAX_NUMBER以内的喊数
	 */
	public void testCountTo100ByNewRule() {
		List<String> numList = fizzBuzzGame.getFizzBuzzNumsListByNewRule(MAX_NUMBER);
		assertEquals(MAX_NUMBER, numList.size());
		
		int count = 1;
		Iterator<String> it = numList.iterator();
		for(;it.hasNext();count++) {
			String currentNum = it.next();
			
			if(count%3==0 && count%5==0) {
				assertEquals("FizzBuzz",currentNum);
			}else if(count%3==0 || Utils.isContainStr(count+"","3")) {
				assertEquals("Fizz",currentNum);
			}else if(count%5==0 || Utils.isContainStr(count+"","5")) {
				assertEquals("Buzz",currentNum);
			}else {
				assertEquals(count+"",currentNum);
			}
		}		
	}
	
	/**
	 * 当喊数为负数时，应抛出错误提示
	 */
	public void testCountToNegative() {
		try {
			fizzBuzzGame.getFizzBuzzNumsList(-1);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"喊数游戏至少从0开始");	
		}
	}
	
	/**
	 * 当喊数为负数时，应抛出错误提示
	 */
	public void testCountToNegativeByNewRule() {
		try {
			fizzBuzzGame.getFizzBuzzNumsListByNewRule(-1);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"喊数游戏至少从0开始");	
		}
	}
}
