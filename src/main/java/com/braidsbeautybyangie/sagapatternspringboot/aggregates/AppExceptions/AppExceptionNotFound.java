package com.braidsbeautybyangie.sagapatternspringboot.aggregates.AppExceptions;

public class AppExceptionNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    public AppExceptionNotFound(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
