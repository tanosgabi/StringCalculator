/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gábor
 */
public class StringCalculatorTest {
    
    public StringCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class StringCalculator.
     */
    @org.junit.Test
    public void testAdd() throws Exception {
        System.out.println("add");
        String numbers = "";
        int expResult = 0;
        int result = StringCalculator.add(numbers);
        assertEquals(expResult, result);
        numbers = "1,2,3,4";
        expResult = 10;
        result = StringCalculator.add(numbers);
        assertEquals(expResult, result);
        try{
            numbers = "1,2,3,-4";
            result = StringCalculator.add(numbers);
        }catch(Exception ex)
        {
            assertEquals(ex.getMessage(),"“Negatives not allowed: -4,");
        }
        StringCalculator.setElvalaszto(";");
        numbers = "1;2;3;4";
        expResult = 10;
        result = StringCalculator.add(numbers);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElvalaszto method, of class StringCalculator.
     */
    @org.junit.Test
    public void testGetElvalaszto() {
        System.out.println("getElvalaszto");
        String expResult = "";
        String result = StringCalculator.getElvalaszto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setElvalaszto method, of class StringCalculator.
     */
    @org.junit.Test
    public void testSetElvalaszto() {
        System.out.println("setElvalaszto");
        String elvalaszto = "";
        StringCalculator.setElvalaszto(elvalaszto);
    }
    
}
