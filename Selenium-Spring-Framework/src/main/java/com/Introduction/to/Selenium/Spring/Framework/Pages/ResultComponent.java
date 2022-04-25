package com.Introduction.to.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.LazyPageFragmentComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;



@LazyPageFragmentComponent
public class ResultComponent extends BasePage {


    @FindBy(xpath = "//div[@class='yuRUbf']")
    private List<WebElement> SearchResultLinks;


    public int GetResultCount(){
        return this.SearchResultLinks.size();
    }

    @Override
    public boolean Is_Loaded() {
        return this.wait.until(webDriver -> !this.SearchResultLinks.isEmpty());
    }
}
