package com.HAH.aspectJ.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import com.HAH.aspectJ.dto.Result;

@Aspect
@Configuration
public class MyTechnicalConcerns {

	@Pointcut("bean(myService)")
	void myServiceBean() {
	}

	@Before(value = "myServiceBean() && args(message,..)", argNames = "message")
	public void BeforeLog(String message) {
		System.out.println("Before Log Execution.");
		System.out.println("Message is %s".formatted(message));
	}

	@AfterReturning(value = "myServiceBean() && args(name,count)", argNames = "result,name,count", returning = "result")
	public void AfterReturnLog(Result result, String name, int count) {
		System.out.println("After Returning Log Execution.");
		System.out.println("Name is %s.".formatted(name));
		System.out.println("Count is %s.".formatted(count));
		System.out.println(result);
	}

	@After(value = "myServiceBean() && args(value,count)", argNames = "value,count")
	public void AfterLog(String value, int count) {
		System.out.println("After Log Execution.");
		System.out.println("Value is %s".formatted(value));
		System.out.println("Count is %d".formatted(count));
	}

}
