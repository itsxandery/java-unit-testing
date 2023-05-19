package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    void testPerformAddition() {
        // Create a mock Calculator object
        Calculator calculator = mock(Calculator.class);

        // Define Calculator mock behavior
        when(calculator.add(4)).thenReturn(4);
    
        // Create a mock Display object
        Display display = mock(Display.class);
    
        // Create a CalculatorUI object with mocks
        CalculatorUI calculatorUI = new CalculatorUI(calculator, display);
    
        // Call performAddition method
        calculatorUI.performAddition(4);
    
        // Verify that Display.displayResult method was called with the expected result
        verify(display).displayResult(4);
    }

    // All other tests seen in Assertions section below

    @Test
    void add_twoIntAddition_isEqual() {
        // ... mock calculator instantiation (will discuss mock objects shortly!)
        Calculator calculator = new Calculator();
        
        assertEquals(2, calculator.add(2));
        assertEquals(4, calculator.add(2));
    }
    
    @Test
    void getResult_twoIntAddition_storedResultIsEqual() {
        // ... mock calculator instantiation (will discuss mock objects shortly!)
        Calculator calculator = new Calculator();

	    calculator.add(3);
	    assertEquals(3, calculator.getResult());
    }

    @Test
    void getResult_twoIntSubtraction_nullBeforeThenNotNullAfter() {
        // ... mock calculator instantiation (will discuss mock objects shortly!)
        Calculator calculator = new Calculator();

        assertNotNull(calculator.getResult());
        calculator.subtract(1);
        assertNotNull(calculator.getResult());
    }

    boolean isEven(int result) {
        if ((result % 2) == 0) {
            return true;
    }
    return false;
    }
    
    @Test
    void getResult_isEven_isTrue() {
        // ... mock calculator instantiation (will discuss mock objects shortly!)
        Calculator calculator = new Calculator();
        
        calculator.add(2);
        assertTrue(isEven(calculator.getResult()));
    }
    
    @Test
    void testSameObject_assertSame() {
        List<String> strList1 = Arrays.asList("test");
        List<String> strList2 = strList1;
        assertSame(strList1, strList2); // Yes, strList1 and strList2 are the same object.
    }
    
    @Test
    void testSameObject_assertNotSame() {
        List<String> strList1 = Arrays.asList("test");
        List<String> strList2 = Arrays.asList("test");
        assertNotSame(strList1, strList2); // Yes, strList1 and strList2 are different objects, although they are equal
    }
    
    private int divide(int a, int b) { return a / b; }
    
    @Test
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> divide(a, b));
    }
}

