package com.Basics.Of.Mockito.Basics.Of.Mockito;

public class BussinessImpl {

    private DataService dataService;

    public BussinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int FindMaxOfAllNumbers() {

        int[] allNumbers = dataService.retrieveAllData();
        int greatestNumber = Integer.MIN_VALUE;

        for (int i : allNumbers) {
            if (i > greatestNumber) {
                greatestNumber = i;
            }

        }
        return greatestNumber;
    }
}

