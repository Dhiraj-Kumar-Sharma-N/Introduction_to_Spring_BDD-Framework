package com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.*;

@Lazy
@Autowired
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LazyAutowired {
}
