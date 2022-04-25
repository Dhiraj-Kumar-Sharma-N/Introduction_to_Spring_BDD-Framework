package com.Introduction.to.Selenium.Spring.Framework.ConditionOnExpression;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Hyundai")
@ConditionalOnExpression("${car.speed} < 100")
public class Hyundai implements Car{

    @Override
    public void RunningSpeed() {
        System.out.println("Hyundai Car is running at 90 Km-ph");
    }
}

