package com.example.boardstudy.global.base.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ErrorResponse {
    private HttpStatus status;
    private String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }

    public ErrorResponse(HttpStatus httpStatus, String errorMessage) {
        this.status = httpStatus;
        this.message = errorMessage;
    }
}
