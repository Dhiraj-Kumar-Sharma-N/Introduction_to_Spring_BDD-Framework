package com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

@Bean
@Scope("BrowserScope")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ThreadScopedBean {
}
