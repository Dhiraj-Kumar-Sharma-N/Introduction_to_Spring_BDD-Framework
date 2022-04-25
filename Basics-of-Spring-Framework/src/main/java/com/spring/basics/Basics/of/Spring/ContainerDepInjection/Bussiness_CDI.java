package com.spring.basics.Basics.of.Spring.ContainerDepInjection;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Bussiness_CDI {
    @Inject
    DatabaseDao_CDI daoCDI;

    public DatabaseDao_CDI getDaoCDI() {
        return daoCDI;
    }

    public void setDaoCDI(DatabaseDao_CDI daoCDI) {
        this.daoCDI = daoCDI;
    }

    public int FindGreatest() {
        int maxvalue = Integer.MIN_VALUE;
        int[] numbers = daoCDI.GetData();
        for (int value : numbers) {
            if (value > maxvalue) {
                maxvalue = value;
            }

        }
        return maxvalue;
    }
}
