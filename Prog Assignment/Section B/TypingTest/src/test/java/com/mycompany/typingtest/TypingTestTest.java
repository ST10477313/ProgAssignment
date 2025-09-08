/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.typingtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ethan
 */
public class TypingTestTest {
    
    public TypingTestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRandomWord method, of class TypingTest.
     */
    @Test
    public void testGetRandomWord() {
        System.out.println("getRandomWord");
        TypingTest instance = null;
        String expResult = "";
        String result = instance.getRandomWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class TypingTest.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        TypingTest instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class TypingTest.
     */
    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        TypingTest instance = null;
        instance.printReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TypingTestImpl extends TypingTest {

        public TypingTestImpl() {
            super(null);
        }

        public void start() {
        }

        public void printReport() {
        }
    }
    
}
