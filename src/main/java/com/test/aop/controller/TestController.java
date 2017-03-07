package com.test.aop.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.aop.service.ITestService;
import com.test.exception.ChuShuZero;

@Controller
public class TestController {
	@Resource
	private ITestService testServiceImpl ;
	@RequestMapping("/test.do")
	public void test() throws ChuShuZero{
		this.testServiceImpl.test();
	}
}
