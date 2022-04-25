package com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.PostConstructPreDestroy.Television;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SeleniumSpringFrameworkApplicationTests {

	@Autowired
    User user;

	@Value("${Environments}")
	private List<String> environments;


	@Value("${Timeout}")
	private int timeout;

	@Value("${Username}")
	private String username;

	@Value("${Path}")
	private String path;

	@Value("${MyUsername:Dhiraj Kumar Sharma N}")
	private String myusername;

	@Autowired
	private Faker faker;

	@Autowired
    Television tv;

	@Test
	void contextLoads() {
		user.PrintUserDetails();
		System.out.println(this.environments);
		System.out.println(this.environments.size());
		System.out.println(this.timeout);
		System.out.println(this.username);
		System.out.println(this.path);
		System.out.println(this.myusername);
		System.out.println(faker.name().firstName());
		System.out.println(faker.name().bloodGroup());
		System.out.println(faker.name().title());
		System.out.println(faker.address().fullAddress());
		tv.PlayMovie();

	}

}


/*

Salary is = 99000
Address is = Mysore
[DEV, UAT, PROD]
3
30
Aparna
C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\VMware\VMware Workstation\bin\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\Aparna\AppData\Local\Microsoft\WindowsApps;;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\bin;
Dhiraj Kumar Sharma N
Nancie
A+
Investor Integration Facilitator
30392 Kanisha Stravenue, Ezekielberg, SD 96838-8507


 */