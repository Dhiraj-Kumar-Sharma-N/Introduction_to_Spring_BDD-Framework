package com.spring.basics.Basics.of.Spring.Framework;

import com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@SpringBootApplication
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
*/
@Configuration
@ComponentScan("com.spring.basics.Basics.of.Spring.Framework.Fundamentals")

public class BasicsOfSpringFrameworkApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(BasicsOfSpringFrameworkApplication.class);

		BinarySearchImpl BinarySearchObj0 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl BinarySearchObjX = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(BinarySearchObj0);
		System.out.println(BinarySearchObjX);

		int Result = BinarySearchObj0.BinarySearch(new int[]{10,20,30,50,70,5,6},6);

		System.out.println("Searched Number is present at " + Result);

		applicationContext.close();

		// - SAME BEAN INSTANCE
		// com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@8a589a2
		//com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@8a589a2

		// - DIFFERENT BEAN INSTANCE @Scope("prototype") or @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		// com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@11dee337
		// com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@460f76a6

		/* For QuickSort
		BinarySearchImpl BinarySearchOb1 = new BinarySearchImpl(new QuickSortAlgorithm());
		// For BubbleSort
		BinarySearchImpl BinarySearchObj2 = new BinarySearchImpl(new BubbleSortAlgorithm());
		*/

		//System.out.println("Searched Number is present at " + Result);


		/* Post Construct and Pre Destroy

		Post Constructor/Setter Call before Other Methods called
		Post Constructor/Setter Call before Other Methods called
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@ca27722
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl@70ab80e3
		Logic to BubbleSort method
		com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BubbleSortAlgorithm@9573b3b

		 */

	}


}
