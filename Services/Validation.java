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
	
	 /**
     * UC3: validating Email of a user. This method is used for validating Email
     * of a user by using Regex. In pattern we define email rules like here and
     * Matcher will match pattern with user input.
     *
     * @param user getting user input for matching
     */
    
    public static void getEmailPattern(User user) {
        //making boolean false.
        boolean matches = false;

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[a-z]+\\.[a-z]+@+[bl?]{2}+\\.+[co?]{2}+\\.[a-z]{2,6}$"));
        Matcher matcher = pattern.matcher(user.getEmail());
        matches = matcher.matches();

        // if  user input is false then this will execute.
        if (matches != true) {
            System.out.println("Email not Valid please input as (abc.xyz@bl.co.in)..");
            UserRegistration.getUserInput();
        } else {
            System.out.println( user.getEmail() + " is Validated! ");
            matches = true;
        }
    }
	
	 /**
     * UC4: validating Phone Number of a user. This method is used for
     * validating phone number of a user by using Regex. In pattern we define
     * phone number with country code. and mobile number should contain 10
     * numbers and Matcher will match pattern with user input.
     *
     * @param user getting user input for matching
     */
    
    public static void getPhoneNumberPattern(User user) {
        //making boolean false.
        boolean matches = false;

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[9?][1?][\\-\\s?][\\d]{10}"));
        Matcher matcher = pattern.matcher(user.getPhoneNumber());
        matches = matcher.matches();

        // if  user input is false then this will execute.
        if (matches != true) {
            System.out.println("Phone Number format should be(91 9919819801 )");
            UserRegistration.getUserInput();
        } else {
            System.out.println("User " + user.getPhoneNumber()+ " is Validated! ");
            matches = true;
        }
    }
	
	 /**
     * UC5: validating Password of a user with Rule1 - minimum of 8 characters
     * The pattern should for following conditions Matcher will match pattern
     * with user input.
     *
     * @param user getting user input for matching
     */
   
    public static void getPasswordPattern(User user) {
        //making boolean false.
        boolean matches = false;

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[a-zA-Z0-9]{8}"));
        Matcher matcher = pattern.matcher(user.getPassword());
        matches = matcher.matches();

        // if  user input is false then this will execute.
        if (matches != true) {
            System.out.println("Password length should be of 8 characters long .");
            UserRegistration.getUserInput();
        } else {
            System.out.println("User Password is Validated! ");
            matches = true;
        }
    }

}


}
