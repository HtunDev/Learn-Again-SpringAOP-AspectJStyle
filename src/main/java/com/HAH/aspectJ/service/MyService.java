package com.HAH.aspectJ.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	public void demoWork() {
		System.out.println("This message from MyService.");
	}

}
