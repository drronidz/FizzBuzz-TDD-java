package test.com.cleverdeveloper;


/*
PROJECT NAME : fizzbuzz-tdd-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2022 11:06 PM
*/

import main.java.com.cleverdeveloper.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", fizzBuzz.generate(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", fizzBuzz.generate(2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", fizzBuzz.generate(3));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() {
        assertEquals("Buzz", fizzBuzz.generate(5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs10() {
        assertEquals("Buzz", fizzBuzz.generate(10));
    }




}