package com.kodilla.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.kodilla.kodilla.spring.calculator.Calculator;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCakculations(){

    calculator.add(2,2);
    calculator.sub(4,0);
    calculator.mul(2,8);
    calculator.div(36,3);

    }
}
