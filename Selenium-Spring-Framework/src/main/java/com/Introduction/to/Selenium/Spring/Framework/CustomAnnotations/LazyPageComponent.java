package com.Introduction.to.Selenium.Spring.Framework.CustomAnnotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Lazy
@Component
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LazyPageComponent {
}
