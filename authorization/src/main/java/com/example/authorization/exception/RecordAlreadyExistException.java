package com.example.authorization.exception;

public class RecordAlreadyExistException extends RuntimeException{
    public RecordAlreadyExistException(String message) {
        super(message);
    }
}
