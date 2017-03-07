package com.test.aop.service;

import org.springframework.stereotype.Service;

import com.test.exception.ChuFa;
import com.test.exception.ChuShuZero;

@Service
public class TestServiceImpl implements ITestService{

	public void test() throws ChuShuZero {
		int a = 100000;
		double b = a;
		int c = 100000;
		double d = c;
		ChuFa cf =new ChuFa();
		 
			int f =cf.chuFa(10, 0); 
		 
	}
	public static void main(String args[]){
		int a = 100000;
		double b = a;
		int c = 100000;
		double d = c;
		System.out.println(b*d);
	}
}
