package com.Introduction.to.Selenium.Spring.Framework.Pages.GoogleComponents;

import com.Introduction.to.Selenium.Spring.Framework.Pages.GooglePageComponent;
import com.Introduction.to.Selenium.Spring.Framework.Utilities.ScreenshotUtil;
import com.google.common.util.concurrent.Uninterruptibles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class GooglePageComponentWithProfileTest {

    @Autowired
    private GooglePageComponent googlePageComponent;

    @Lazy
    @Autowired
    private ScreenshotUtil screenshot;

    @Lazy
    @Autowired
    private JavascriptExecutor js;

    //spring.profiles.active=stg

    @Test
    public void TestGoogleProfile() throws IOException {
        googlePageComponent.Go_to_URL();
        Assertions.assertTrue(this.googlePageComponent.Is_Loaded());

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

        this.googlePageComponent.getSearchComponent().search("Environment ");
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().Is_Loaded());
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().GetResultCount() >2);

        // Since we have lazy autowired dependency and not using the object reference Execution is Faster
        //this.screenshot.GrabScreenshot("Screenshot2.png");


        this.googlePageComponent.close();

        //js.executeScript("");
    }
}