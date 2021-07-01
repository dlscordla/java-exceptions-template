package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException (String errorMessage) {
        super(errorMessage);
    }
}
