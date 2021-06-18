
package com.bridgelabz.regex.Models;

/**
 * This is the model class for User Registration class.
 */

public class User {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String password;
    private String email;

    // no argument constructor.
    public User() {
    }

    // getters and setters.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNname) {
        this.firstName = firstNname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}
