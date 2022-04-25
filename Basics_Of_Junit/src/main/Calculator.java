package main;

public class Calculator {

    public int sum(int[] numbers){
        int sum = 0;
        for (int j :numbers) {
            sum += j;
        }
        return sum;
    }
    public int product(int[] numbers){
        int product = 1;
        for (int j :numbers) {
            product *= j;
        }
        return product;
    }

    public int addition(int number1,int number2){
        int result = number1 + number2;
        return result;
    }
    public int subtraction(int number1,int number2){
        int result = number1 - number2;
        return result;
    }
    public int division(int number1,int number2){
        int result = number1 / number2;
        return result;
    }

    public int multiplication(int number1,int number2){
        int result = number1 * number2;
        return result;
    }
}
