package com.HAH.aspectJ.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({
	"com.HAH.aspectJ.aspects",
	"com.HAH.aspectJ.service"
})
public class ApplicationConfig {

}
