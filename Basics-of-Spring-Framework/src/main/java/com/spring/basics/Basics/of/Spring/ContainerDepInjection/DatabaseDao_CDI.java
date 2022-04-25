package com.spring.basics.Basics.of.Spring.ContainerDepInjection;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class DatabaseDao_CDI {

    public int[] GetData(){
        return new int[]{1,5,7};
    }
}
