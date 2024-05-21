package com.HAH.aspectJ.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MyTechnicalConcerns {

	@Pointcut("bean(myService)")
	void myServiceBean() {
	}
	
	@Before(value = "myServiceBean()")
	public void BeforeLog() {
		System.out.println("Before Log Execution.");
	}
}
