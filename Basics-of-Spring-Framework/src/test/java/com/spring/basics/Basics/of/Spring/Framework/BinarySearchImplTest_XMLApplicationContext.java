package com.spring.basics.Basics.of.Spring.Framework;

import com.spring.basics.Basics.of.Spring.Framework.Fundamentals.BinarySearchImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/TestApplicationContext.xml")
class BinarySearchImplTest_XMLApplicationContext {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void TestBinarySearch() {
        //BinarySearchImpl binarySearch1 = Mockito.mock(BinarySearchImpl.class);
        //Mockito.when(binarySearch.BinarySearch(new int[]{2,4,6,8,5,12,3,7},8)).thenReturn(3);

        int result = binarySearch.BinarySearch(new int[]{2,4,6,8,5,12,3,7},8);
        System.out.println(result);
        Assertions.assertEquals(5,
                binarySearch.BinarySearch(new int[]{2,4,6,8,5,12,3,7},8));

    }
}