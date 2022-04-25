package com.Basics.Of.Mockito.Basics.Of.Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BussinessImplTestUsingMockitoAnnotation {

    @Mock
    DataService dataServiceMock;
    @InjectMocks
    BussinessImpl bussinessimpl;

    @Test
    void FindMaxOfAllNumbers() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,6,33,2,7});
        System.out.println("Maximum Number is = "+ bussinessimpl.FindMaxOfAllNumbers());
        Assertions.assertEquals(33, bussinessimpl.FindMaxOfAllNumbers());
    }

    @Test
    void FindMaxOfAllNumbers1() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        System.out.println("Maximum Number is = "+ bussinessimpl.FindMaxOfAllNumbers());
        Assertions.assertEquals(Integer.MIN_VALUE, bussinessimpl.FindMaxOfAllNumbers());
    }

    @Test
    void FindMaxOfAllNumbers2() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{-14,-7,-33});
        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        System.out.println("Maximum Number is = "+ bussinessimpl.FindMaxOfAllNumbers());
        Assertions.assertEquals(-7, bussinessimpl.FindMaxOfAllNumbers());
    }

    @Test
    void FindMaxOfAllNumbers3() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{9});
        BussinessImpl bussinessimpl = new BussinessImpl(dataServiceMock);
        System.out.println("Maximum Number is = "+ bussinessimpl.FindMaxOfAllNumbers());
        Assertions.assertEquals(9, bussinessimpl.FindMaxOfAllNumbers());
    }
}