package com.blog.service.exceptions;

public class PasswordNotMatchException extends RuntimeException{
    public PasswordNotMatchException(String message) {
        super(message);
    }
    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
