package com.Basics.Of.Mockito.Basics.Of.Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;


public class ListInterfaceMockingUsingMockito {

    @Test
    public void TestSizeForSingleReturn(){
        List list = Mockito.mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        Assertions.assertEquals(10,list.size());
        Assertions.assertEquals(10,list.size());
    }

    @Test
    public void TestSizeForMultipleReturn(){
        List list = Mockito.mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        Assertions.assertEquals(10,list.size());
        Assertions.assertEquals(20,list.size());
        Assertions.assertEquals(30,list.size());
    }

    @Test
    public void TestGetWithSpecificArgument(){
        List list = Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn("Dhiraj");
        Assertions.assertEquals("Dhiraj",list.get(0));
        Assertions.assertEquals(null,list.get(1));

    }

    @Test
    public void TestGetWithGenericArgument(){
        List list = Mockito.mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("Dhiraj");
        Assertions.assertEquals("Dhiraj",list.get(0));
        Assertions.assertEquals("Dhiraj",list.get(1));
        Assertions.assertEquals("Dhiraj",list.get(123456789));

    }

}
