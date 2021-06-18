package com.bridgelabz.regex.Services;

import com.bridgelabz.regex.Models.User;
import com.bridgelabz.regex.UserRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    /**
     * UC1: validating Last name of a user. This method is used for validating
     * First Name of a user by using Regex. In pattern we define rules like here
     * First Name first letter should be capital and minimum characters should
     * be 3. And matcher will match user input with our pattern
     *
     * @param user getting user input for matching
     */
    
    public static void getFirstNamePattern(User user) {

        //making boolean false.
        boolean matches = false;

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[A-Z]{1}[a-z]{2,}"));
        Matcher matcher = pattern.matcher(user.getFirstName());
        matches = matcher.matches();

        // if  user input is false then this will execute.
        if (matches != true) {
            System.out.println("First Letter Should Be Capital..");
            UserRegistration.getUserInput();
        } else {
            System.out.println("User " + user.getFirstName() + " is Validated! ");
            matches = true;
        }
    }
	
	 /**
     * UC2: validating Last name of a user. This method is used for validating
     * Last name of a user by using Regex. In pattern we define rules like here
     * First letter of Last Name should be capital and minimum characters should
     * be 3. And matcher will match user input with our pattern
     *
     * @param user getting user input for matching
     */
    
    public static void getLastNamePattern(User user) {
        //making boolean false.
        boolean matches = false;

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[A-Z]{1}[a-z]{2,}"));
        Matcher matcher = pattern.matcher(user.getLastName());
        matches = matcher.matches();

        // if  user input is false then this will execute.
        if (matches != true) {
            System.out.println("First Letter of Last Name Should Be Capital..");
            UserRegistration.getUserInput();
        } else {
            System.out.println("Last Name is Validated! ");
            matches = true;
        }
    }


}
