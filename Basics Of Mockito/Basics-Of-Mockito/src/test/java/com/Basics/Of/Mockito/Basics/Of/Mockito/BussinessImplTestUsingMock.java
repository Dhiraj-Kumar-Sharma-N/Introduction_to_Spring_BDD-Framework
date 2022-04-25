package com.Basics.Of.Mockito.Basics.Of.Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BussinessImplTestUsingMock {

    @Test
    void FindMaxOfAllNumbers() {

        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{14,7,33});

        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        int maxNumber = bussinessimpl.FindMaxOfAllNumbers();
        System.out.println("Maximum Number is = "+ maxNumber);
        Assertions.assertEquals(33,maxNumber);
    }

    @Test
    void FindMaxOfAllNumbers1() {

        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});

        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        int maxNumber = bussinessimpl.FindMaxOfAllNumbers();
        System.out.println("Maximum Number is = "+ maxNumber);
        Assertions.assertEquals(-2147483648,maxNumber);
    }

    @Test
    void FindMaxOfAllNumbers2() {

        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{-14,-7,-33});

        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        int maxNumber = bussinessimpl.FindMaxOfAllNumbers();
        System.out.println("Maximum Number is = "+ maxNumber);
        Assertions.assertEquals(-7,maxNumber);
    }

    @Test
    void FindMaxOfAllNumbers3() {

        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{9});

        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        int maxNumber = bussinessimpl.FindMaxOfAllNumbers();
        System.out.println("Maximum Number is = "+ maxNumber);
        Assertions.assertEquals(9,maxNumber);
    }
}