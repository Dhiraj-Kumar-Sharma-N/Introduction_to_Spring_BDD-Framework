package com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages;

import com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages.Address;
import com.Introduction.to.Selenium.Spring.Framework.Selenium.Spring.Framework.Pages.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Salary salary ;

    @Autowired
    private Address address ;

    public void PrintUserDetails(){
        System.out.println("Salary is = "+salary.getAmount());
        System.out.println("Address is = "+address.getAddress());

    }
}
