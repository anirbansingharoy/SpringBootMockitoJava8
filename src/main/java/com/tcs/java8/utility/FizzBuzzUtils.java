package com.tcs.java8.utility;

public class FizzBuzzUtils {

    public static String getFizzBuzzResponse(int inputNumber)
    {

        if(inputNumber%3==0&&inputNumber%15!=0)
            return "fizz";
        else if (inputNumber%5==0&&inputNumber%15!=0)
            return "buzz";
        else if (inputNumber%15==0)
            return "fizzbuzz";
        return  String.valueOf(inputNumber);
    }

}
