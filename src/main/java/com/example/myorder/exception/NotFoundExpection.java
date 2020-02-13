package com.example.myorder.exception;

public class NotFoundExpection extends RuntimeException {
    public NotFoundExpection (String message){
        super(message);
    }
}
