package com.group.eratosthenes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFinderTest {
    private PrimeFinder primeFinder;

    @BeforeEach
    public  void setUp() {
        primeFinder = new PrimeFinder();
    }

    @Test
    public void testGetPrimesHappyPath() {
        List<Integer> actual = primeFinder.getPrimes(120);
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetPrimesWithOne() {
        List<Integer> actual = primeFinder.getPrimes(1);
        List<Integer> expected = new ArrayList<>();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetPrimesWithNegative() {
        List<Integer> actual = primeFinder.getPrimes(-1);
        List<Integer> expected = new ArrayList<>();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testGetPrimesWithLargeNumber() {
        List<Integer> result = primeFinder.getPrimes(10000000);
        Assertions.assertEquals(result.size(), 664579); // too many numbers to write out, so just comparing number of primes.
    }
}
