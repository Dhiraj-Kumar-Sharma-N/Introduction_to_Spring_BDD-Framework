package com.spring.basics.Basics.of.Spring.ContainerDepInjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class Bussiness_CDITest {

    @Mock
    DatabaseDao_CDI databaseDao_cdiMock;
    @InjectMocks
    Bussiness_CDI bussiness_cdi;

    @Test
    void TestFindGreatest() {
        Mockito.when(databaseDao_cdiMock.GetData()).thenReturn(new int[]{2,5,9});
        Assertions.assertEquals(9, bussiness_cdi.FindGreatest());

    }
    @Test
    void TestFindGreatestEquals() {
        Mockito.when(databaseDao_cdiMock.GetData()).thenReturn(new int[]{2,2});
        Assertions.assertEquals(2, bussiness_cdi.FindGreatest());

    }
    @Test
    void TestFindGreatestNoNumbers() {
        Mockito.when(databaseDao_cdiMock.GetData()).thenReturn(new int[]{});
        Assertions.assertEquals(Integer.MIN_VALUE, bussiness_cdi.FindGreatest());

    }

}