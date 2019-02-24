package com.academy.lesson08;

public class ParseAbonentNameException extends Exception {

    private static final String Message = "The Last Name and First Name can't be less than 3 symbols";

            public String getMessage() {
        return Message;
    }

}
