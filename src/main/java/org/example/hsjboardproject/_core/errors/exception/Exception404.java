package org.example.hsjboardproject._core.errors.exception;

import org.springframework.http.HttpStatus;

public class Exception404 extends RuntimeException {
    public Exception404(String msg) {
        super(msg);
    }

}