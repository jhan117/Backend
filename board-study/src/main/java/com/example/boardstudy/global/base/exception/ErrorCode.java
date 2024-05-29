package com.example.boardstudy.global.base.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    DUPLICATED_USERNAME(HttpStatus.CONFLICT, "Username already exists"),
    USER_NOTFOUND(HttpStatus.NOT_FOUND, "User not found"),
    PASSWORD_INCORRECT(HttpStatus.UNAUTHORIZED, "Password incorrect"),

    UN_AUTHENTICATION(HttpStatus.UNAUTHORIZED, "Unauthorized"),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "Access denied"),
    ;
    private HttpStatus status;
    private String message;
}
