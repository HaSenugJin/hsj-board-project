package org.example.hsjboardproject._core.errors.exception;

import org.springframework.http.HttpStatus;

public class Exception500 extends RuntimeException {

    public Exception500(String message) {
        super(message);
    }
}