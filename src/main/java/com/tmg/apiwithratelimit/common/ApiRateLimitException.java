package com.tmg.apiwithratelimit.common;

public class ApiRateLimitException extends RuntimeException {
    public ApiRateLimitException(String message) {
        super(message);
    }
}
