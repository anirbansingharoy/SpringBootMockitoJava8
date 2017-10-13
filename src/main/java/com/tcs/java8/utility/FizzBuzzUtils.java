package com.tcs.java8.utility;

public class FizzBuzzUtils {

    public static String getFizzBuzzResponse(int inputNumber) throws RuntimeException
    {
      if(inputNumber<0)
          throw new RuntimeException("NEGETIVE NUMBER IS NOT ALLOWED");
        if (inputNumber%15==0)
            return "fizzbuzz";
        else if(inputNumber%3==0)
            return "fizz";
        else if (inputNumber%5==0)
            return "buzz";
        return  String.valueOf(inputNumber);
    }

}
