package com.teachmeskills.lesson13;

import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13.task1.service.Utils1;
import com.teachmeskills.lesson13.task2.service.Utils2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1 or 2");
        int i= scanner.nextInt();

        System.out.println("Enter login");
        scanner.nextLine();
        String login= scanner.nextLine();
        System.out.println("Enter password");
        String password= scanner.nextLine();
        System.out.println("Enter confirmPassword");
        String confirmPassword= scanner.nextLine();


        switch (i){
            case 1:
                try {
                    Utils1.toCheck(password,login,confirmPassword);
                }catch (WrongLoginException e){
                    System.out.println(e.getMessage());
                }catch (WrongPasswordException m){
                    System.out.println(m.getMessage());
                } break;
            case 2:
                try {
                    Utils2.toCheck(password,login,confirmPassword);
                }catch (WrongLoginException e){
                    System.out.println(e.getMessage());
                }catch (WrongPasswordException m){
                    System.out.println(m.getMessage());
                } break;
        }


    }

}
