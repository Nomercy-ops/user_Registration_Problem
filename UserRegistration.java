package com.bridgelabz.regex;

import java.util.function.Predicate;

/**
 * Uc 11: refactor the code for validating user input with lamda functions
 * 
 */

public class UserRegistration {
    
    /**
     *  This is method that takes userInput and regex pattern and return the result.
     * It call the is valid method that use predicate and return true or false
     * @param userInput
     * @param regex 
     */

    public void validateUsers(String userInput,String regex) {
        boolean isValid = isDataValid(userInput,
                (String info) -> {
                    return info.matches(regex);
                });

        System.out.println("the provided input is " + isValid);

    }
    
/**
 *  This method predicate the match result and provide whether user input is valid or not. 
 * @param data
 * @param predicate
 * @return 
 */
    private static boolean isDataValid(String data, Predicate<String> predicate) {
        return predicate.test(data);
    }
}
