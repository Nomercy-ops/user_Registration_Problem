/**
 * *******************************************************************************************
 *
 * <p>
 * Purpose: is to validate user input Lamda functions and regex.
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @since 23/06/21
 * <p>
 *******************************************************************************************
 */
package com.bridgelabz.regex;

import java.util.Scanner;

public class Runner {

    /**
     * Uc 11: refactor the code for validating user input with lamda functions
     * This Method is used for getting the user input for validation. After
     * getting user input it call the Validation method for pattern matching.
     */
    public static void getUserInput() {

        // variables for pattern
        String nameRegex = "^[A-Z]{1}[a-z]{2,}";
        String emailRegex = "^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$";
        String phoneNumberRegex = "^[\\+?][9?][1?][\\s\\-?][\\d]{10}";
        String passwordRegex = "^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        
        // taking user inputing and calling lamdafunctions for validation.
        UserRegistration validate = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String userName = scanner.next();
        validate.validateUsers(userName, nameRegex);
        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();
        validate.validateUsers(lastName, nameRegex);
        System.out.println("Enter Your email: ");
        String userMail = scanner.next();
        validate.validateUsers(userMail, emailRegex);
        System.out.println("Enter Your Mobile Number: ");
        String phoneNumber = scanner.next();
        validate.validateUsers(phoneNumber, phoneNumberRegex);
        System.out.println("Enter a Password: ");
        String password = scanner.next();
        validate.validateUsers(password, passwordRegex);
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
