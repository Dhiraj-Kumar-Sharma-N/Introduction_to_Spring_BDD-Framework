package com.spring.basics.Basics.of.Spring;

import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication;
import com.spring.basics.Basics.of.Spring.XMLConguration.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication

public class XMLBasicsOfSpringFrameworkApplication {

	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);


	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("./ApplicationContext.xml");

		XmlPersonDao personBussiness = applicationContext.getBean(XmlPersonDao.class);

		System.out.println(personBussiness);
		System.out.println(personBussiness.getXmlJdbcConnection());

		/*

		JDBC Connection
		com.spring.basics.Basics.of.Spring.XMLConguration.XmlPersonDao@1b7cc17c
		com.spring.basics.Basics.of.Spring.XMLConguration.XmlJdbcConnection@59662a0b

		 */
		}


}
