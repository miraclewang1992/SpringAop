package com.test.exception;

public class ChuFa {
	public int chuFa(int a,int b) throws ChuShuZero{
		if(b==0){
			throw new ChuShuZero("除数不能为0");
		}
		return a/b;
	}
}
