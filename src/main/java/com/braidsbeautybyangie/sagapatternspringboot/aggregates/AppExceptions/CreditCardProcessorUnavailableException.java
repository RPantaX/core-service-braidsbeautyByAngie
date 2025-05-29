package com.braidsbeautybyangie.sagapatternspringboot.aggregates.AppExceptions;

public class CreditCardProcessorUnavailableException extends RuntimeException {
    public CreditCardProcessorUnavailableException(Throwable cause) {
        super(cause);
    }
}
