package com.Introduction.to.Selenium.Spring.Framework.ConditionOnExpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} > 100")
public class Mercedez implements Car {

    @Override
    public void RunningSpeed() {
        System.out.println("Mercedez Car is running at 120 Km-ph");
    }
}
