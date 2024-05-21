package com.HAH.aspectJ.service;

import org.springframework.stereotype.Component;

import com.HAH.aspectJ.dto.Result;

@Component
public class MyService {

	public Result demoWork(String name, int data) {
		System.out.println("This message from MyService.");
		return new Result(name, data);
	}

	public int divided(int a, int b) {
		return a / b;
	}

}
