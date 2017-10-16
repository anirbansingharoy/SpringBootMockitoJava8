package com.tcs.java8.utility;

public class FizzBuzzUtils {

    public static String getFizzBuzzResponse(int inputNumber) throws IllegalArgumentException
    {
      if(inputNumber<0)
          throw new IllegalArgumentException();
        if (inputNumber%15==0)
            return "fizzbuzz";
        else if(inputNumber%3==0)
            return "fizz";
        else if (inputNumber%5==0)
            return "buzz";
        return  String.valueOf(inputNumber);
    }

}
