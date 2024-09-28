package com.github.alimalek.gerimedica.assignment.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class HttpException extends RuntimeException {
    private final HttpStatus statusCode;
    private final String errorMessage;
}