package com.Introduction.to.Selenium.Spring.Framework.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class JavaScriptExecutorUtil {

    @Autowired
    private JavascriptExecutor javascriptExecutor;

    @Autowired
    private WebDriver driver;

    public void ExecuteJS(){
    }

}
