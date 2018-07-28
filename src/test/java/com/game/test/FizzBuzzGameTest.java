package com.game.test;

import java.util.Iterator;
import java.util.List;

import com.game.IFizzBuzzGame;
import com.game.impl.FizzBuzzGameImpl;
import com.util.Utils;

import junit.framework.TestCase;

/**
 * ���Ժ�����Ϸ�Ƿ����������
 * @author willa_zhang
 * @date 2018��7��28��
 *
 */
public class FizzBuzzGameTest extends TestCase {
	final int MAX_NUMBER = 100;
	
	private IFizzBuzzGame fizzBuzzGame;
	
	protected void setUp() {
		fizzBuzzGame = new FizzBuzzGameImpl();
	}
	
	/**
	 * ����23���ڵĺ���
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
	 * �����¹�����23���ڵĺ���
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
	 * ����MAX_NUMBER���ڵĺ���
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
	 * �����¹�����MAX_NUMBER���ڵĺ���
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
	 * ������Ϊ����ʱ��Ӧ�׳�������ʾ
	 */
	public void testCountToNegative() {
		try {
			fizzBuzzGame.getFizzBuzzNumsList(-1);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"������Ϸ���ٴ�0��ʼ");	
		}
	}
	
	/**
	 * ������Ϊ����ʱ��Ӧ�׳�������ʾ
	 */
	public void testCountToNegativeByNewRule() {
		try {
			fizzBuzzGame.getFizzBuzzNumsListByNewRule(-1);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"������Ϸ���ٴ�0��ʼ");	
		}
	}
}
