package com.example.myorder.exception;

public class AlreadyExistsExption extends RuntimeException{
    public AlreadyExistsExption( String message){
        super(message);
    }
}
