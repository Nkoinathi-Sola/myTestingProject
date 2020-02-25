package com.testersAssignment.TestingDisabled;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Ignore
public class DisabledTest {

    public String message = "NKOSINATHI";

    DisabledProgram junitMessage = new DisabledProgram(message);

        @Test
        public void testJUnitMessage() {

            System.out.println("Junit Message is printing ");
            assertEquals(message, junitMessage.printMessage());

        }

        @Test
        public void testJUnitHiMessage() {
            message="Hi!" +message;
            System.out.println("Junit Hi Message is printing ");
            assertEquals(message, junitMessage.printHiMessage());

        }
    }
