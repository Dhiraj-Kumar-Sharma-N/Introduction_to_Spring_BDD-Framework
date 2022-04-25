package com.Introduction.to.Selenium.Spring.Framework.ConditionOnExpression;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarTest {

    @Autowired
    //@Qualifier("Hyundai")

    private Car car;

    @Test
    void CarTest() {
        this.car.RunningSpeed();
    }
}