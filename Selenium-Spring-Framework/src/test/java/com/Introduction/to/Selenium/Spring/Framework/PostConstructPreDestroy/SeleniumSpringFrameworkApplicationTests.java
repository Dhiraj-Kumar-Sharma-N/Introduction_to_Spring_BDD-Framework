package com.Introduction.to.Selenium.Spring.Framework.PostConstructPreDestroy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumSpringFrameworkApplicationTests {
	@Autowired
	Television tv;

	@Test
	void contextLoads() {
		tv.PlayMovie();

	}

}


/*



 */