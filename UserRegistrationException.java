package com.bridgelabz.regex;

/**
 *
 * This is the custom exception handler class. By using this class we can
 * provide custom message for invalids input provided by user.
 */

public class UserRegistrationException extends RuntimeException {

    public UserRegistrationException(String message) {
        super(message);
    }

}
