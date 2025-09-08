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
public class WordTypingTestTest {
    
    public WordTypingTestTest() {
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
     * Test of start method, of class WordTypingTest.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        WordTypingTest instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class WordTypingTest.
     */
    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        WordTypingTest instance = null;
        instance.printReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectRandomWord method, of class WordTypingTest.
     */
    @Test
    public void testSelectRandomWord() {
        System.out.println("selectRandomWord");
        WordTypingTest instance = null;
        String expResult = "";
        String result = instance.selectRandomWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResults method, of class WordTypingTest.
     */
    @Test
    public void testGetResults() {
        System.out.println("getResults");
        WordTypingTest instance = null;
        Word[] expResult = null;
        Word[] result = instance.getResults();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
