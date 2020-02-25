package com.testersAssignment.FailingTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 Try modify one of the test to force a test failure and observe the test result, e.g.,

 @Test
 public void testAddPass() {
 assertEquals("error in add()",  0, Calculator.add(1, 2));
 .....
 }
 **/

public class FailingTest {
    @Test
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in add()",  3, FailingProgram.add(1, 2));
        assertEquals("error in add()", -3, FailingProgram.add(-1, -2));
        assertEquals("error in add()",  9, FailingProgram.add(9, 0));
    }

    @Test
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals("error in add()", 0, FailingProgram.add(1, 2));
    }

    @Test
    public void testSubPass() {
        assertEquals("error in sub()",  1, FailingProgram.sub(2, 1));
        assertEquals("error in sub()", -1, FailingProgram.sub(-2, -1));
        assertEquals("error in sub()",  0, FailingProgram.sub(2, 2));
    }

    @Test
    public void testSubFail() {
        assertNotEquals("error in sub()", 0, FailingProgram.sub(2, 1));
    }
}

