package com.testersAssignment.TestingDisabled;

public class DisabledProgram {
    private String message;

    public DisabledProgram(String message) {
        this.message = message;
    }

    public String printMessage(){

        System.out.println(message);

        return message;
    }

    public String printHiMessage(){

        message="Hi!"+ message;

        System.out.println(message);

        return message;
    }
}
