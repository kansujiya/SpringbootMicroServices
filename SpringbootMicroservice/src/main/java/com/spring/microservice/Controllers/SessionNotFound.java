package com.spring.microservice.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class SessionNotFound extends RuntimeException {
    public SessionNotFound(String exception) {
        super(exception);
    }
}
