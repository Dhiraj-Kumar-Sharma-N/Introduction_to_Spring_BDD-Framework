package com.Basics.Of.Mockito.Basics.Of.Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BussinessImplTest {

    @Test
    void FindMaxOfAllNumbers() {

        BussinessImpl bussinessimpl = new BussinessImpl(new DataServiceStub());
        int maxNumber = bussinessimpl.FindMaxOfAllNumbers();
        System.out.println("Maximum Number is = "+ maxNumber);
        Assertions.assertEquals(18,maxNumber);
    }
}
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{2, 18, 5, 7, 8, 12};
    }
}

class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{2};
    }
}

class DataServiceStub2 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}

class DataServiceStub3 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{-1,-4,-7,-9,-22};
    }
}


/*
    When we use Stub for performing JUNIT Testing we need gto create multiple Stub instance
    for each combination of input data and also need to add unimplemented methods of any interface it implements
    so in order to overcome it we make use of Mockito to mock the data
 */