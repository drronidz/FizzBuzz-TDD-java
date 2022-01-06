package test.com.cleverdeveloper;


/*
PROJECT NAME : fizzbuzz-tdd-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2022 11:06 PM
*/

import main.java.com.cleverdeveloper.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", new FizzBuzz().generate(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", new FizzBuzz().generate(2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", new FizzBuzz().generate(3));
    }


}