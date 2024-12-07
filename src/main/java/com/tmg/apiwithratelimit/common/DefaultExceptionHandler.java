package com.tmg.apiwithratelimit.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(ApiRateLimitException.class)
    public ResponseEntity<Object> handleApiRateLimitException(ApiRateLimitException e) {
        return new ResponseEntity<>("rate limit reached", HttpStatus.TOO_MANY_REQUESTS);
    }

}
