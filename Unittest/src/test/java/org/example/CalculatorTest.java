package org.example;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;



class CalculatorTest {

    @Test
    public void testEmptySum() {
        List<Double> numbers = new ArrayList<>();
        double result = Calculator.sum(numbers);

        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testTwoSum() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.0);

        double result = Calculator.sum(numbers);
        assertEquals(4, result);
    }

    @Test
    public void testNull(){
        try{
            double result = Calculator.sum(null);
            fail("No exception thrown");
        }
        catch (NullPointerException e) {
        }
    }
}