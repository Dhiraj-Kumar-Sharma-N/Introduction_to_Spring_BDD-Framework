package com.spring.basics.Basics.of.Spring;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.basics.Basics.of.Spring.ContainerDepInjection.Bussiness_CDI;
import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication;
import com.spring.basics.Basics.of.Spring.Framework.BasicsOfSpringFrameworkApplication;
import com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring.ContainerDepInjection")
public class CDIBasicsOfSpringFrameworkApplication {

	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);


	public static void main(String[] args) {

		//ApplicationContext applicationContext = SpringApplication.run(CDIBasicsOfSpringFrameworkApplication.class, args);
		AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(CDIBasicsOfSpringFrameworkApplication.class);

		Bussiness_CDI BinarySearchObj0 = applicationContext.getBean(Bussiness_CDI.class);

		System.out.println(BinarySearchObj0);
		//com.spring.basics.Basics.of.Spring.ContainerDepInjection.Bussiness_CDI@29cfd92b

		System.out.println(BinarySearchObj0.getDaoCDI());
		//com.spring.basics.Basics.of.Spring.ContainerDepInjection.Dao_CDI@18e7143f

		logger.info("{} , DAO ={}",BinarySearchObj0,BinarySearchObj0.getDaoCDI());

		System.out.println(BinarySearchObj0.FindGreatest());
		//11:54:33.152 [main] INFO com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication - com.spring.basics.Basics.of.Spring.ContainerDepInjection.Bussiness_CDI@32910148 ,
		// DAO =com.spring.basics.Basics.of.Spring.ContainerDepInjection.Dao_CDI@3f56875e
	}


}
