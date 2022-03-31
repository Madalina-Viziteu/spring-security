package com.demo.springsecurity.api.rest.errorhandling;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorMessage {

    private final Integer statusCode;
    private final String message;
}
