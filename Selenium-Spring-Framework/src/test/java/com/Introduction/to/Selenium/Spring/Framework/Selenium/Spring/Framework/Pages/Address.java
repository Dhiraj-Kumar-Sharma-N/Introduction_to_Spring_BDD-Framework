package com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${Address:Address Not Updated Yet}")
    private String address;

    public String getAddress() {
        return address;
    }
}
