package com.academy.lesson08;

public class ParseAgeException extends Exception {

    private static final String Message = "The age can't be more than 200 years";

    public String getMessage() {
        return Message;
    }

}
