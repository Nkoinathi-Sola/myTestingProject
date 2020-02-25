package com.testersAssignment.TestingObjectIdentity;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMethods {
    Object[] expectedEmps = new Object[3];

    @Before
    public void initInputs(){
        expectedEmps[0] = new ObjectIdentityTest(1, "Nats", 15000);
        expectedEmps[1] = new ObjectIdentityTest(2, "Kalid", 25000);
        expectedEmps[2] = new ObjectIdentityTest(3, "Krish", 5000);
    }

    @Test
    public void compareEmployees(){
        /**
         * convert List of objects to array of objects
         */
        Object[] testOutput = ObjectIdentityTest.getEmpList().toArray();
        assertArrayEquals(expectedEmps, testOutput);
    }
}
