package com.testersAssignment.TestingEquality;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualityTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        //change the expected answer to check if the test will fail
        assertEquals("The expected answer is: 2+2=4",4,answer);
    }
}
