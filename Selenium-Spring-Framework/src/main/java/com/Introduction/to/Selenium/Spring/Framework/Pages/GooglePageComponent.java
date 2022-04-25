package com.Introduction.to.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.LazyPageComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@LazyPageComponent
public class GooglePageComponent extends BasePage {

    @Autowired
    private SearchComponent searchComponent;
    @Autowired
    private ResultComponent resultComponent;

    @Value("${Application.url}")
    private String url;

    public void Go_to_URL() {
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    @Override
    public boolean Is_Loaded() {
        return this.searchComponent.Is_Loaded();
    }

    public ResultComponent getResultComponent() {
        return resultComponent;
    }


    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public void close() {
        this.driver.quit();
    }
}
