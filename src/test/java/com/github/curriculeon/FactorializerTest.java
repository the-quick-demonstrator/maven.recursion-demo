package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class FactorializerTest {
    @Test
    public void testFactorial1() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 0;
        Integer expected = 1;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorial2() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 1;
        Integer expected = 1;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial3() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 2;
        Integer expected = 2;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial4() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 3;
        Integer expected = 3;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial5() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 4;
        Integer expected = 5;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial6() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 5;
        Integer expected = 8;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial7() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 6;
        Integer expected = 13;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial8() {
        // given
        Recurser factorializer = new Recurser();
        Integer input = 7;
        Integer expected = 21;

        // when
        Integer actual = factorializer.factorial(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
