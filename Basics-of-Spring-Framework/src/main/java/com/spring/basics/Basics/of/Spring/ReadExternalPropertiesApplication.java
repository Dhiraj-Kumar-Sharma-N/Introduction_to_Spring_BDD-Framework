package com.spring.basics.Basics.of.Spring;

import com.spring.basics.Basics.of.Spring.ExternalProperties.ReadPropertiesfromExternalFile;
import com.spring.basics.Basics.of.Spring.Framework.AdvancedBeanScopeFrameworkApplication;
import com.spring.basics.Basics.of.Spring.XMLConguration.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring.ExternalProperties")
@PropertySource("./application.properties")

public class ReadExternalPropertiesApplication {

	private static Logger logger = LoggerFactory.getLogger(AdvancedBeanScopeFrameworkApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationcontext =new AnnotationConfigApplicationContext(ReadExternalPropertiesApplication.class);


		ReadPropertiesfromExternalFile readpropertiesfromexternalfile = applicationcontext.getBean(ReadPropertiesfromExternalFile.class);

		System.out.println(readpropertiesfromexternalfile);
		System.out.println(readpropertiesfromexternalfile.getApplicationurl());
		System.out.println(readpropertiesfromexternalfile.getUsername());
		System.out.println(readpropertiesfromexternalfile.getPassword());

	/*

	https://serverice.login.com/login
	Dhiraj Kumar Sharma N
	Qwerty@123

	 */
		}


}
