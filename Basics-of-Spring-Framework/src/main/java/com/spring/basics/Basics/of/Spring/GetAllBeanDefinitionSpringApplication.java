package com.spring.basics.Basics.of.Spring;

import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring")
public class GetAllBeanDefinitionSpringApplication {
	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("./ApplicationContext.xml");


		logger.info("All the Beans are = {}",(Object)applicationContext.getBeanDefinitionNames());


		/*
		All the Beans are = [CDIBasicsOfSpringFrameworkApplication,
		scopedTarget.componentScanJDBCConnection,
		 componentScanJDBCConnection,
		 componentScanPersonDAO,
		 bussiness_CDI,
		 databaseDao_CDI,
		  scopedTarget.JDBCConnection,
		   JDBCConnection,
		   personDAO,
		    advancedBeanScopeFrameworkApplication,
		    basicsOfSpringFrameworkApplication,
		    basicsOfSpringPostConstructApplication,
		    componentScanFrameworkApplication,
		     binarySearchImpl, bubbleSortAlgorithm,
		      quickSortAlgorithm,
		       getAllBeanDefinitionSpringApplication,
		        org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
		        org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
		        org.springframework.context.event.internalEventListenerProcessor,
		         org.springframework.context.event.internalEventListenerFactory,
		        xmlPersonDAO, xmlJdbcConnection]
	 */
		}


}
