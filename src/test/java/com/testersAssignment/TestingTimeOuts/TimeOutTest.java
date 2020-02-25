package com.testersAssignment.TestingTimeOuts;

// Rather than specifying timeout attribute for all tests separately,
// we can define JUnit Rule for all tests in a class.
// In this example test will pass
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutTest {
    //Please note that above timeout @Rule applies on @Before and @After methods as well.
    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Test   //Pass
    public void testInfiniteTametakingLoop1() throws InterruptedException
    {
        while (true)
        {
            Thread.currentThread().sleep(1000);
        }
    }

}
