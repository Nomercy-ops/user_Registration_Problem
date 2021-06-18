/*********************************************************************************************
 *                                                                                                      
 *  Purpose: is to validate user entered  details for registration using regular expression.                                             
 *                                                                                               
 *  @author  Rikesh Chhetri                                                                      
 *  @version 1.0                                                                                                
 *  @since   18/06/21                                                                           
 *                                                                                               
 *********************************************************************************************/

package com.bridgelabz.regex;

// importing required class files from model and services.
import com.bridgelabz.regex.Services.Validation;
import com.bridgelabz.regex.Models.User;

import java.util.Scanner;

public class UserRegistration {

    /**
     * This Method is used for getting the user input for validation. After
     * getting user input it call the Validation method for pattern matching.
     */
	 
    public static void getUserInput() {

        // creating object of User class for getting and setting user inputs 
        User user = new User();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        user.setFirstName(scanner.next());
        Validation.getFirstNamePattern(user); //calling validation method.
		
		System.out.println("Enter Your Last Name: ");
        user.setLastName(scanner.next());
        Validation.getLastNamePattern(user); //calling validation method.
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
