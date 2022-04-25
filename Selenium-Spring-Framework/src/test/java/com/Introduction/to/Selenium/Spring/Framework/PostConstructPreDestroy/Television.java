package com.Introduction.to.Selenium.Spring.Framework.PostConstructPreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    @Value("${tv.name}:Cartoon Network")
    public String tvchannel;

    public Television() {
        System.out.println("Value of TV post Bean Construction = "+this.tvchannel);
    }

    @PostConstruct
    public  void setup_PostConstruct(){
        System.out.println("Value of TV post Bean Construction = "+this.tvchannel);
        System.out.println("Turning TV on.........");
    }

    public void PlayMovie(){
        for (int i = 0;i<6;i++ ) {
            System.out.println("Playing Scene = "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @PreDestroy
    public void teardown_PreDestroy(){
        System.out.println("Turning TV off..........");
    }
}


/*

Value of TV post Bean Construction = null
Value of TV post Bean Construction = Sony:Cartoon Network
Turning TV on.........
2022-04-18 12:16:57.635  INFO 9356 --- [    Test worker] .SeleniumSpringFrameworkApplicationTests : Started SeleniumSpringFrameworkApplicationTests in 0.694 seconds (JVM running for 1.602)
Playing Scene = 0
Playing Scene = 1
Playing Scene = 2
Playing Scene = 3
Playing Scene = 4
Playing Scene = 5
Turning TV off..........

 */