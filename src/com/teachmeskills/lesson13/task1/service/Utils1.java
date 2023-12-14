package com.teachmeskills.lesson13.task1.service;

import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils1 {

    public static void toCheck(String password, String login, String confirmPassword) throws WrongPasswordException, WrongLoginException{
        Pattern pattern=Pattern.compile("\\d{1}");
        Matcher matcher= pattern.matcher(password);
        if(login.length()>=20 || login.contains(" ")) {
            throw new WrongLoginException("Login does not match the correct format!");
        }
        if(password.length()>=20 || password.contains(" ") || !matcher.find() || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password does not match the correct format!");
        }
    }

}
