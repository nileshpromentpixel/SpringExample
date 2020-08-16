package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={ "com.application","com.controller"})
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);

		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfigration.class);
		SingleTone singleTone1 = context1.getBean(SingleTone.class);
		singleTone1.setMessage("this is Singletone Scope");
		// System.out.print(singleTone1 + "---");

		SingleTone singleTone2 = context1.getBean(SingleTone.class);
		singleTone2.getMessage();
		// System.out.print(singleTone2);

		ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfigration.class);

		Prototype prototype1 = context2.getBean(Prototype.class);
		prototype1.setMessage("non");
		System.out.print(prototype1.getMessage());

		System.out.print(prototype1 + "---*---");

		Prototype prototype2 = context2.getBean(Prototype.class);
		// prototype2.getMessage();

		System.out.print(prototype2.getMessage());

	}

}
