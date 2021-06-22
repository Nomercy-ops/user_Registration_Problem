/**
 * *******************************************************************************************
 *
 * <p>
 * Purpose: Determines whether or not n is prime.
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @since 18/06/21
 * <p>
 *******************************************************************************************
 */
package com.bridgelabz.regex;

import java.util.Scanner;

public class Runner {

    /**
     * This Method is used for getting the user input for validation. After
     * getting user input it call the Validation method for pattern matching.
     */
    public static void getUserInput() {
        UserRegistration users = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String userName = scanner.next();
        users.validateUserName(userName);

        //        System.out.println("Enter Your Last Name: ");
        //        user.setName(scanner.next());
        //        userValidation.getNamePattern(user);
        ////
        //        System.out.println("Enter Your email: ");
        //        user.setEmail(scanner.next());
        //        Validation.getEmailPattern(user);
        //          System.out.println("Enter Your Mobile Number: ");
        //          user.setPhoneNumber(scanner.next());
        //          Validation.getPhoneNumberPattern(user);
        //          System.out.println("Enter a Password: ");
        //          user.setPassword(scanner.next());
        //          Validation.getPasswordPattern(user);
    }

    /**
     * This is the main method of User Registration class. From here we are
     * calling get user input Method for starting validation.
     *
     * @param args
     */
    public static void main(String[] args) {

        getUserInput();
    }
}
