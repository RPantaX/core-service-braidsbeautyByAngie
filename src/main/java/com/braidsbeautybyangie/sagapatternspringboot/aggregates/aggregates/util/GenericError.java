package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.util;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.AppExceptions.TypeException;

public interface GenericError {
    String getTitle();

    String getCode();

    String getMessage();

    TypeException getType();

}
