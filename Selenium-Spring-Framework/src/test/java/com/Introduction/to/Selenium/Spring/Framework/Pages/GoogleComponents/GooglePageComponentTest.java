package com.Introduction.to.Selenium.Spring.Framework.Pages.GoogleComponents;

import com.Introduction.to.Selenium.Spring.Framework.Pages.GooglePageComponent;
import com.Introduction.to.Selenium.Spring.Framework.Utilities.ScreenshotUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@SpringBootTest
class GooglePageComponentTest {
    @Autowired
    private GooglePageComponent googlePageComponent;

    @Lazy
    @Autowired
    private ScreenshotUtil screenshot;

    @Lazy
    @Autowired
    private JavascriptExecutor js;

    @Test
    public void TestGoogle() throws IOException {
        googlePageComponent.Go_to_URL();
        Assertions.assertTrue(this.googlePageComponent.Is_Loaded());

        this.googlePageComponent.getSearchComponent().search("Spring boot");
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().Is_Loaded());
        Assertions.assertTrue(this.googlePageComponent.getResultComponent().GetResultCount() >2);

        // Since we have lazy autowired dependency and not using the object reference Execution is Faster
        //this.screenshot.GrabScreenshot("Screenshot2.png");


        //this.googlePageComponent.close();

        //js.executeScript("");
    }
}