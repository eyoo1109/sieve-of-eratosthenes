package com.group.eratosthenes.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeFinder {
    public List<Integer> getPrimes(Integer max) {
        List<Integer> result = new ArrayList<>();
        if(max < 1) {
            // If the input is 0 or a negative number, there are no prime numbers. return empty list
            return result;
        } else {
            result = primes(max);
        }
        return result;
    }

    private List<Integer> primes(int max) {
        List<Integer> result = new ArrayList<>();
        boolean[] map = new boolean[max+1];
        for(int i = 2; i <= max; i++) {
            if(!map[i]) {
                int multiplier = 2;
                while (i * multiplier <= max) {
                    map[i * multiplier] = true;
                    multiplier++;
                }
            }
        }
        for(int j = 2; j <= max; j++) {
            if(!map[j]) {
                result.add(j);
            }
        }
        return result;
    }
}
