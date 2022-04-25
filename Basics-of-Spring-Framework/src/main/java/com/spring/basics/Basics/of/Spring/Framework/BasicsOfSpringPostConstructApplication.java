package com.spring.basics.Basics.of.Spring.Framework;

import com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring.Framework.Fundamentals")
//@SpringBootApplication
public class BasicsOfSpringPostConstructApplication {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = SpringApplication.run(BasicsOfSpringPostConstructApplication.class, args);
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(BasicsOfSpringPostConstructApplication.class);

        BinarySearchImpl BinarySearchObj0 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(BinarySearchObj0);

        int Result = BinarySearchObj0.BinarySearch(new int[]{2, 4, 6, 8, 5, 12, 3, 7}, 8);


		/*  =  POST CONSTRUCT =
			@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
					public class BinarySearchImpl {
		Post Constructor/Setter Call before Other Methods called
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@7fb9f71f
		Logic to QuickSort method
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.QuickSortAlgorithm@3b366632

		  =  PRE DESTROY = (We need to change the scoping of BinarySearch to Singleton for
		 Pre-destroy to Work)

		@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
				public class BinarySearchImpl {

		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@1cf2fed4
		Logic to QuickSort method
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.QuickSortAlgorithm@3af4e0bf
		Post Methods are called and the bean is destroyed/Removed
		 */

    }


}
