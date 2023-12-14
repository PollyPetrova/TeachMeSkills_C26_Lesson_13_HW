package com.teachmeskills.lesson13.task2.service;

import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils2 {

    public static void toCheck(String password, String login, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        Pattern pattern=Pattern.compile("\\d{1}");
        Matcher matcher= pattern.matcher(password);
        int containPassword=0;
        int containLogin=0;
        String[] passwordCheck=password.split(" ");
        for (int i = 0; i < passwordCheck.length; i++) {
            containPassword++;
        }
        String[] loginCheck=login.split(" ");
        for (int i = 0; i < loginCheck.length; i++) {
            containLogin++;
        }
        if(loginCheck.length>=20 || containLogin>1) {
            throw new WrongLoginException("Login does not match the correct format!");
        }
        if(passwordCheck.length>=20 || containPassword>1 || !matcher.find() || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password does not match the correct format!");
        }
    }

}
