package com.Introduction.to.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.LazyAutowired;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    @LazyAutowired
    protected WebDriver driver;


    @LazyAutowired
    protected WebDriverWait wait;

    public abstract boolean Is_Loaded();

    @PostConstruct
    public void initializeWebElements(){
        PageFactory.initElements(this.driver,this);
    }
}
