package com.example.dbconnect;

import com.example.dbconnect.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication()
public class DbconnectApplication {
	// creating a logger
	private static Logger logger
			= LoggerFactory.getLogger(DbconnectApplication.class);

	public static void main(String[] args) {
		logger.info("********** Log level: Spring boot Main Application starts**************");
		SpringApplication.run(DbconnectApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//
//		};
//	}

}