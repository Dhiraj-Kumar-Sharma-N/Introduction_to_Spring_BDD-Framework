package com.Introduction.to.Selenium.Spring.Framework.Pages.GoogleComponents;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.LazyAutowired;
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
class GooglePageComponentCustomAnnotationTest {
    @LazyAutowired
    private GooglePageComponent googlePageComponent;

    @LazyAutowired
    private ScreenshotUtil screenshot;

    @LazyAutowired
    private JavascriptExecutor js;

    @Test
    public void TestGoogle() throws IOException {

    }
}