package com.Introduction.to.Selenium.Spring.Framework.Pages.GoogleComponents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootTest
class GooglePageComponentWebdriverFactoryTest {

    @Autowired
    private ApplicationContext applicationContext;



    @Test
    public void TestMultiBrowserGoogle() throws IOException {
        this.applicationContext.getBean("chromeDriver", WebDriver.class).get("https://www.yahoo.com");
        this.applicationContext.getBean("EdgeDriver", WebDriver.class).get("https://www.gmail.com");


    }
}