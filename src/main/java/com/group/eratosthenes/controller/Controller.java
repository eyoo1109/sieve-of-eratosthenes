package com.group.eratosthenes.controller;

import com.group.eratosthenes.service.PrimeFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private PrimeFinder primeFinder;

    @GetMapping("/primes")
    public String getPrimes(@RequestParam(name="max",required = true) Integer max) {
        return primeFinder.getPrimes(max).toString();
    }

}