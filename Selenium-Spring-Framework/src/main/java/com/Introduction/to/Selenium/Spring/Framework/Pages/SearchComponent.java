package com.Introduction.to.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.LazyPageFragmentComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@LazyPageFragmentComponent
public class SearchComponent extends BasePage  {

    @FindBy(name = "q")
    private WebElement SearchTextBox;

    @FindBy(name = "btnK")
    private List<WebElement> SearchBtns;

    public void search(final String keyword){
        this.SearchTextBox.sendKeys(keyword);
        this.SearchTextBox.sendKeys(Keys.TAB);
        this.SearchBtns
                .stream().
                filter(webElement -> webElement.isDisplayed() && webElement.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean Is_Loaded() {
       return this.wait.until(webDriver -> this.SearchTextBox.isDisplayed());
    }
}
