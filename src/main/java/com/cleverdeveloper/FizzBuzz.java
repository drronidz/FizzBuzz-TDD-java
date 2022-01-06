package main.java.com.cleverdeveloper;

/*
PROJECT NAME : fizzbuzz-tdd-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2022 11:02 PM
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzz {

    public String generate(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";

        return String.valueOf(number);
    }

}
