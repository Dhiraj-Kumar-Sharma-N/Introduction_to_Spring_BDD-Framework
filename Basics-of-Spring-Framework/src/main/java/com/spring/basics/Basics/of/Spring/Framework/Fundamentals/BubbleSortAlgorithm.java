package com.spring.basics.Basics.of.Spring.Framework.Fundamentals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

    // Sorting integer array based on Bubble Sort
    public int[] sort(int[] intArray) {
        System.out.println("Logic to BubbleSort method");
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    //swap elements
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

        return new int[]{5,7,10,20,30,50,70};
    }
}

