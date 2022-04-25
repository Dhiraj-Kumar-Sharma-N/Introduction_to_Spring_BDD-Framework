package test;

import main.Calculator;
import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeAll
    public static void BeforeAllMethods(){
        System.out.println("Before All Test Methods");
    }

    @AfterAll
    public static void AfterAllMethods(){
        System.out.println("After All Test Methods");
    }
    @BeforeEach
    void BeforeEachTest(){
        System.out.println("Before Each Test");
    }


    @AfterEach
    void AfterEachTest(){
        System.out.println("After Each Test");
    }

    @Test
    void sumOf2numbers() {
        Assertions.assertEquals(7, calculator.sum(new int[]{2, 5}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void sumOf3numbers() {
        Assertions.assertEquals(10, calculator.sum(new int[]{2, 5, 3}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void sumOf4numbers() {
        Assertions.assertEquals(15, calculator.sum(new int[]{2, 5, 3, 5}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void productOf2numbers() {
        Assertions.assertEquals(10, calculator.product(new int[]{2, 5}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void productOf3numbers() {
        Assertions.assertNotNull(calculator.product(new int[]{2, 5, 3}));
        Assertions.assertEquals(30, calculator.product(new int[]{2, 5, 3}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void productOf4numbers() {
        Assertions.assertEquals(120, calculator.product(new int[]{2, 5, 3, 4}));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void additionOf2Numbers() {
        Assertions.assertEquals(12, calculator.addition(10, 2));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void subtractionOf2Numbers() {
        Assertions.assertEquals(8, calculator.subtraction(10, 2));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void divisionOf2Numbers() {
        Assertions.assertEquals(5, calculator.division(10, 2));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    void multiplicationOf2Numbers() {
        Assertions.assertEquals(20, calculator.multiplication(10, 2));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

}

/*

"C:\Program Files\Java\jdk-18\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar=57807:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Aparna\.m2\repository\org\junit\platform\junit-platform-launcher\1.8.1\junit-platform-launcher-1.8.1.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1\plugins\junit\lib\junit-rt.jar;C:\Users\Aparna\Desktop\Dhiraj Docs\Basics of Spring Framework\Basics_Of_Junit_with_Gradle\out\production\Basics_Of_Junit;C:\Users\Aparna\.m2\repository\org\junit\jupiter\junit-jupiter\5.8.1\junit-jupiter-5.8.1.jar;C:\Users\Aparna\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.8.1\junit-jupiter-api-5.8.1.jar;C:\Users\Aparna\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\Aparna\.m2\repository\org\junit\platform\junit-platform-commons\1.8.1\junit-platform-commons-1.8.1.jar;C:\Users\Aparna\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\Aparna\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.8.1\junit-jupiter-params-5.8.1.jar;C:\Users\Aparna\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.8.1\junit-jupiter-engine-5.8.1.jar;C:\Users\Aparna\.m2\repository\org\junit\platform\junit-platform-engine\1.8.1\junit-platform-engine-1.8.1.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 @w@C:\Users\Aparna\AppData\Local\Temp\idea_working_dirs_junit.tmp @C:\Users\Aparna\AppData\Local\Temp\idea_junit.tmp -socket57806
Before All Test Methods
Before Each Test
subtractionOf2Numbers
After Each Test
Before Each Test
productOf2numbers
After Each Test
Before Each Test
sumOf3numbers
After Each Test
Before Each Test
divisionOf2Numbers
After Each Test
Before Each Test
productOf3numbers
After Each Test
Before Each Test
multiplicationOf2Numbers
After Each Test
Before Each Test
additionOf2Numbers
After Each Test
Before Each Test
sumOf4numbers
After Each Test
Before Each Test
sumOf2numbers
After Each Test
Before Each Test
productOf4numbers
After Each Test
After All Test Methods

Process finished with exit code 0


 */