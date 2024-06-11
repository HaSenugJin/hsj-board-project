package org.example.hsjboardproject._core.errors.exception;

import org.springframework.http.HttpStatus;

public class Exception401 extends RuntimeException {

    public Exception401(String msg) {
        super(msg);
    }

}