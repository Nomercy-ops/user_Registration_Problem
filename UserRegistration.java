package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

  

    /**
     * UC1: validating Last name of a user.This method is used for validating
     * First Name of a user by using Regex.In pattern we define rules like here
     * First Name first letter should be capital and minimum characters should
     * be 3.And matcher will match user input with our pattern
     *
     * @param name
     * @return true or false
     */
    public boolean validateUserName(String name) {

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[A-Z]{1}[a-z]{2,}"));
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    /**
     * UC3: validating Email of a user.This method is used for validating Email
     * of a user by using Regex.In pattern we define email rules like here and
     * Matcher will match pattern with user input.UC9: validating pattern Email
     * with all sample emails
     *
     * @param email
     * @return true or false
     */
    public boolean validateUserEmail(String email) {

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$"));
        Matcher matcher = pattern.matcher(email);
        boolean matches = matcher.matches();

        return matches;
    }

    /**
     * UC4: validating Phone Number of a user.This method is used for validating
     * phone number of a user by using Regex. In pattern we define phone number
     * with country code. and mobile number should contain 10 numbers and
     * Matcher will match pattern with user input.
     *
     * @param phoneNumber
     * @return true or false
     */
    public boolean validateUserPhoneNumber(String phoneNumber) {

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile(("^[\\+?][9?][1?][\\s\\-?][\\d]{10}"));
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean matches = matcher.matches();

        return matches;

    }

    /**
     * UC5: validating Password of a user with Rule1 - minimum of 8
     * characters.UC6: validating password of a user with Rule2 - password
     * should have at least 1 Capital letter. UC7: validating password of a user
     * with Rule2 - password should have at least 1 numbers. UC7: validating
     * password of a user with Rule2 - password should have at least 1 special.
     * The pattern should for following conditions Matcher will match pattern
     * with user input.
     *
     * @param password
     * @return true or false
     */
    public boolean validateUserPassword(String password) {

        // defining pattern and matcher class for validation
        Pattern pattern = Pattern.compile("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        return matches;

    }

}
