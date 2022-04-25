package com.spring.basics.Basics.of.Spring.Framework;

import com.spring.basics.Basics.of.Spring.ComponentScan.ComponentScanPersonDAO;
import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootApplication
@ComponentScan("com.spring.basics.Basics.of.Spring.ComponentScan")
// By Default its scans for the components in the specified package
// if the class is present in different package then we need to component scan into that package

public class ComponentScanFrameworkApplication {

	//private static Logger logger = LoggerFactory.getLogger(ComponentScanFrameworkApplication.class);

	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(ComponentScanFrameworkApplication.class, args);
		AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(ComponentScanFrameworkApplication.class);

		ComponentScanPersonDAO personDAO = applicationContext.getBean(ComponentScanPersonDAO.class);

		System.out.println(personDAO);
		System.out.println(personDAO.getJdbcConnection());


		/*

		if bean not found in the same package:

		Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
		 No qualifying bean of type
		'com.spring.basics.Basics.of.Spring.ComponentScan.ComponentScanPersonDAO' available

		Need to Component Scan now :
		@SpringBootApplication
		@ComponentScan(package path)

		com.spring.basics.Basics.of.Spring.ComponentScan.ComponentScanPersonDAO@21d5c1a0
		com.spring.basics.Basics.of.Spring.ComponentScan.ComponentScanJDBCConnection@7e094740

		 */
	}


}
