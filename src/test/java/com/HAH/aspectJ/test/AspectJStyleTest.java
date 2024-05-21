package com.HAH.aspectJ.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.aspectJ.config.ApplicationConfig;
import com.HAH.aspectJ.service.MyService;

@SpringJUnitConfig(classes = ApplicationConfig.class)
public class AspectJStyleTest {

	@Autowired
	private MyService myService;

	@Test
	void demoTest() {
		myService.demoWork("Htun Aung Hlaing", 7);
		myService.divided(7, 0);
	}
}
