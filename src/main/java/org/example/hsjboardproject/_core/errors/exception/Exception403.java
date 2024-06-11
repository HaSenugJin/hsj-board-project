package org.example.hsjboardproject._core.errors.exception;

import org.springframework.http.HttpStatus;

public class Exception403 extends RuntimeException {

    public Exception403(String msg) {
        super(msg);
    }

}