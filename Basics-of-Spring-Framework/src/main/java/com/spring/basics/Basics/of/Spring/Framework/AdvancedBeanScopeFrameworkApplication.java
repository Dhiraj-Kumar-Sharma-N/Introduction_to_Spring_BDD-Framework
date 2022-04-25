package com.spring.basics.Basics.of.Spring.Framework;

import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring.Framework")

// By Default its scans for the components in the specified package
// if the class is present in different package then we need to component scan into that package

public class AdvancedBeanScopeFrameworkApplication {

	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);

	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(AdvancedBeanScopeFrameworkApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(AdvancedBeanScopeFrameworkApplication.class)){



		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		logger.debug("{}",personDAO);
		System.out.println(personDAO);
		System.out.println(personDAO.getJdbcConnection());

		logger.debug("{}",personDAO1);
		System.out.println(personDAO1);
		System.out.println(personDAO.getJdbcConnection());

		};
		/*
		com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO@7bb3a9fe
		com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.JDBCConnection@7cbee484
		com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO@7bb3a9fe
		com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.JDBCConnection@7cbee484

		In order to Retrieve different JDBC Connection for each person we need
		to use proxy along with @Scope tag

		When one of the dependency is Prototype then the bean using it is not a prototype
		then we need to solve it by using Proxy

	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
	proxyMode = ScopedProxyMode.TARGET_CLASS)

	com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO@6f70f32f
	com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.JDBCConnection@3d6300e8
	com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.PersonDAO@6f70f32f
	com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScope.JDBCConnection@1b822fcc

		 */
	}


}
