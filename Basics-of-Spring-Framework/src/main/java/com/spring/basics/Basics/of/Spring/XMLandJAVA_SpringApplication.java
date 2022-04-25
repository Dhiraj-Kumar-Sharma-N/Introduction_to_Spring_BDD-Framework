package com.spring.basics.Basics.of.Spring;

import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication;
import com.spring.basics.Basics.of.Spring.XMLConguration.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication

public class XMLandJAVA_SpringApplication {

	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);


	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("./ApplicationContext.xml");


		logger.info("All the Beans are = {}",(Object)applicationContext.getBeanDefinitionNames());


		/*
		All the Beans are = [xmlPersonDAO, xmlJdbcConnection]
		 */
		}


}
