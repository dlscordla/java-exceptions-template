package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {
    public NotCorrectPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
