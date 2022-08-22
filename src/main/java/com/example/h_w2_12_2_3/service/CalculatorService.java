package com.example.h_w2_12_2_3.service;

import com.example.h_w2_12_2_3.exception.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Number plus(Integer a, Integer b) {
        return a + b;
    }
    public Number minus(Integer a, Integer b) {
        return a - b;
    }
    public Number multiply(Integer a, Integer b) {
        return a * b;
    }
    public Number divide(Integer a, Integer b) {
        if (b == 0) {
            throw new DivideByZeroException("Делить на ноль нельзя");
        }
        return a.doubleValue() / b;
    }

}