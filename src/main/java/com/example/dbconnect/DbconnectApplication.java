package com.example.dbconnect;

import com.example.dbconnect.service.PropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class DbconnectApplication {
	// creating a logger
	private static Logger logger
			= LoggerFactory.getLogger(DbconnectApplication.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private PropService propService;

	public static void main(String[] args) {
		logger.info("********** Log level: Spring boot Main Application starts**************" );
		SpringApplication.run(DbconnectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			PropService propService = applicationContext.getBean(PropService.class);
			String userRole = propService.getUserRole();
			System.out.println("User role: " + userRole);
			logger.info("********** Log level: User Role **************" + userRole);
		};
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