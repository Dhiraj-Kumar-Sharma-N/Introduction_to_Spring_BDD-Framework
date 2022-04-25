package com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {


    @Value("${Salary}")
    private int amount;

    public int getAmount() {
        return amount;
    }
}
