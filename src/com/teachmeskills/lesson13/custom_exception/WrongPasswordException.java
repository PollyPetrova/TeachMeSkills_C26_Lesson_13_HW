package com.teachmeskills.lesson13.custom_exception;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message){
        super(message);
    }

}
