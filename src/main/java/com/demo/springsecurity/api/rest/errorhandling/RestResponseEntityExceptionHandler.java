package com.demo.springsecurity.api.rest.errorhandling;

import com.demo.springsecurity.model.AccountNotFoundException;
import com.demo.springsecurity.model.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({AccountNotFoundException.class, UserNotFoundException.class})
    public ResponseEntity<ErrorMessage> invalidRequestParameterExceptionMapper(RuntimeException e) {
        ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(message);
    }
}
