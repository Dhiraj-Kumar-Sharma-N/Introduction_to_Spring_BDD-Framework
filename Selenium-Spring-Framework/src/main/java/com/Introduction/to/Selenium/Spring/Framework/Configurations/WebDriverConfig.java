package com.Introduction.to.Selenium.Spring.Framework.Configurations;

import com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations.ThreadScopedBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

@Lazy
@Configuration
@Profile("!remote")
public class WebDriverConfig {

    @Value("${DefaultTimeout:30}")
    public int timeouts;

    @ThreadScopedBean
    @ConditionalOnProperty(name = "browser.name", havingValue = "firefox")
    public WebDriver FirfoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @ThreadScopedBean
    @ConditionalOnProperty(name = "browser.name", havingValue = "edge")
    public WebDriver EdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }


    @ThreadScopedBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
        return new ChromeDriver();
    }


    @Bean(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver,timeouts);
    }


}



    /* =================  BEAN INJECTION  THROUGH @PRIMARY TAG ======================
            @Bean
            @Primary
            public WebDriver EdgeDriver(){
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
     ==================================================================================*/

       /* ==========  BEAN INJECTION  THROUGH @ConditionalOnProperty TAG ==========

           @Bean
            @ConditionalOnProperty(name="browser.name",havingValue = "edge")
            public WebDriver EdgeDriver(){
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }

     ==================================================================================*/

        /* ========== DEFAULT BEAN INJECTION  THROUGH @ConditionalOnMissingBean TAG ==========

            @Bean
        @ConditionalOnMissingBean
        public WebDriver chromeDriver(){
            WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
            return new ChromeDriver();
        }



     ==================================================================================*/



