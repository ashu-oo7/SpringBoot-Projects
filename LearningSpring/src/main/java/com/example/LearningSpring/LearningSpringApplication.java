package com.example.LearningSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Alien alien = (Alien)context.getBean(Alien.class);
//		System.out.println(alien.getName() +" "+ alien.getNo());\
		SpringApplication.run(LearningSpringApplication.class,args);
	}

}
