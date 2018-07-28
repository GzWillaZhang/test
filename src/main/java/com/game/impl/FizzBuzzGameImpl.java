package com.game.impl;

import java.util.ArrayList;
import java.util.List;

import com.game.IFizzBuzzGame;
import com.util.Utils;

public class FizzBuzzGameImpl implements IFizzBuzzGame{
	List<String> numberList = new ArrayList<String>();//存储喊数结果
	
	public List<String> getFizzBuzzNumsList(int maxNum){
		if(maxNum<0) {
			throw new IllegalArgumentException("喊数游戏至少从0开始");
		}else {
			for(int i=1;i<=maxNum;i++) {
				if(i%3==0 && i%5==0) {
					numberList.add("FizzBuzz");
				}else if(i%3==0) {
					numberList.add("Fizz");
				}else if(i%5==0) {
					numberList.add("Buzz");
				}else {
					numberList.add(i+"");
				}
			}
		}
		Utils.printCollections(numberList.iterator());
		return numberList;
	}
	
	public List<String> getFizzBuzzNumsListByNewRule(int maxNum){
		if(maxNum<0) {
			throw new IllegalArgumentException("喊数游戏至少从0开始");
		}else {
			for(int i=1;i<=maxNum;i++) {
				if(i%3==0 && i%5==0) {
					numberList.add("FizzBuzz");
				}else if(i%3==0 || Utils.isContainStr(i+"","3")) {
					numberList.add("Fizz");
				}else if(i%5==0 || Utils.isContainStr(i+"","5")) {
					numberList.add("Buzz");
				}else {
					numberList.add(i+"");
				}
			}
		}
		Utils.printCollections(numberList.iterator());
		return numberList;
	}
}
