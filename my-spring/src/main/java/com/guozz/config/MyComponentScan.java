package com.guozz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.guozz")
public class MyComponentScan {

	@Configuration
	@ComponentScan("com.guozz")
	class InnerClass{

	}
}
