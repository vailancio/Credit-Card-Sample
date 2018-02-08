package com.vailancio;
import java.util.Date;

public class User {
    public String firstName;
    public String lastName;

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + ' ' + this.lastName;
    }

    public void displayUserDetails(){
        System.out.println("Customer: "+this.getName());
    }
}