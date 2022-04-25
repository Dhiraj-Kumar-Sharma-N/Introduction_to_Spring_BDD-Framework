package com.spring.basics.Basics.of.Spring.Framework.Fundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    @Autowired
    //@Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm SortAlgorithm) {
        super();
        this.sortAlgorithm = SortAlgorithm;
    }
    // Sorting array --> Search an Array --> Returning the Result(Position of the searched Number)

    public int BinarySearch(int[] intArray, int NumberToSearch) {
        List<Integer> list = new ArrayList<>(intArray.length);

        int[] SortedNumbers = sortAlgorithm.sort(intArray);
        System.out.println((sortAlgorithm));

        int position = list.indexOf(NumberToSearch);
        return 5;
    }
    /*@PostConstruct
    public static void PostConstruct(){
        System.out.println("Post Constructor/Setter Call before Other Methods called");
    }

    @PreDestroy
    public static void PreDestroy(){
        System.out.println("Post Methods are called and the bean is destroyed/Removed");
    }

     */
}



        /* =================================== LEGACY WAY========================================

        // Bubble Sort Object

        BubbleSortAlgorithm BubbleSortObj = new BubbleSortAlgorithm();
        System.out.println(Arrays.toString(BubbleSortObj.sort(intArray)));

        // Quick Sort Object

        int n = intArray.length;
        QuickSortAlgorithm quickSortObj = new QuickSortAlgorithm();
        quickSortObj.sort(intArray,0,n-1);
        quickSortObj.printArray(intArray);


        # Priority for keeping the bean  >> @ Priority << By Name << @ qualifier
          By Name(with same name as class name in first character to be lower case)

             @Autowired
            private sortAlgorithm bubbleSortAlgorithm;

            @Autowired
            private sortAlgorithm quickSortAlgorithm;

           # Bean Scope 1. Singleton = one instance per Spring Context
                        2. Prototype = New bean whenever Requested

        ========================================================================================*/

