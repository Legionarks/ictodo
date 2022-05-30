package com.ictodo.exception;

public class SomeException extends Exception {

    public SomeException() {
    }

    public SomeException(String message) {
        super(message);
    }

    public SomeException(Throwable cause) {
        super(cause);
    }

    public SomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
