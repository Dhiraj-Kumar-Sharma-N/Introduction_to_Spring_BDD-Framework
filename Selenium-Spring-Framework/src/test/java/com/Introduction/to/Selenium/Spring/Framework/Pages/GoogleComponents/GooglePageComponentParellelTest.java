package com.Introduction.to.Selenium.Spring.Framework.Pages.GoogleComponents;

import com.Introduction.to.Selenium.Spring.Framework.Configurations.FakerConfig;
import com.Introduction.to.Selenium.Spring.Framework.Pages.GooglePageComponent;
import com.Introduction.to.Selenium.Spring.Framework.Utilities.ScreenshotUtil;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@Execution(ExecutionMode.CONCURRENT)
@SpringBootTest
class GooglePageComponentParellelTest {
    @Autowired
    private GooglePageComponent googlePageComponent;

    @Lazy
    @Autowired
    private ScreenshotUtil screenshot;

    @Lazy
    @Autowired
    private FakerConfig fakerConfig;

    @Lazy
    @Autowired
    private JavascriptExecutor js;

    @Test
    public void TestGoogle1() throws IOException {
        googlePageComponent.Go_to_URL();
        Assertions.assertTrue(this.googlePageComponent.Is_Loaded());

        this.googlePageComponent.getSearchComponent().search("Spring boot");
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().Is_Loaded());
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().GetResultCount() >2);
        this.screenshot.GrabScreenshot();
    }

    @Test
    public void TestGoogle2() throws IOException {
        googlePageComponent.Go_to_URL();
        Assertions.assertTrue(this.googlePageComponent.Is_Loaded());
        this.googlePageComponent.getSearchComponent().search("QA Automation");
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().Is_Loaded());
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().GetResultCount() >2);
    }
}