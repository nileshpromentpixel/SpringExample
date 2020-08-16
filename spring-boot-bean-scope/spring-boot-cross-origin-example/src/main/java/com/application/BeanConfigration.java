package com.application;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigration {

	@Bean
	@Scope("singleton")
	public SingleTone singleTone() {
		return new SingleTone();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Prototype prototype() {
		return new Prototype();
	}

}
