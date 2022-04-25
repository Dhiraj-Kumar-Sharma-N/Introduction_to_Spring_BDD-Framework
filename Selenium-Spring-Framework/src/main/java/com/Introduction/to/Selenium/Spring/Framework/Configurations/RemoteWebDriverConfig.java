package com.Introduction.to.Selenium.Spring.Framework.Configurations;


import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.ThreadScopedBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.net.URL;

@Lazy
@Configuration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    public URL url;

    @Value("${DefaultTimeout:30}")
    public int timeouts;


    @ThreadScopedBean
    @ConditionalOnProperty(name = "browser.name", havingValue = "firefox")
    public WebDriver RemoteFirfoxDriver() {
        return new RemoteWebDriver(this.url , DesiredCapabilities.firefox());
    }


    @ThreadScopedBean
    @ConditionalOnProperty(name = "browser.name", havingValue = "edge")
    public WebDriver RemoteEdgeDriver() {
        return new RemoteWebDriver(this.url, DesiredCapabilities.edge());
    }


    @ThreadScopedBean
    @Lazy
    //@ConditionalOnMissingBean
    @ConditionalOnProperty(name = "browser.name", havingValue = "chrome")
    public WebDriver RemoteChromeDriver() {
        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver,timeouts);
    }

}



