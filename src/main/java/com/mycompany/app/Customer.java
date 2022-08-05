package com.mycompany.app;

import java.time.LocalDate;

public class Customer {
    private final String email;
    private final String phoneNumber;
    private final String firstName;
    private final String lastName;
    private final LocalDate age;

    public Customer(String email, String phoneNumber, String firstName, String lastName, LocalDate age) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getAge() {
        return age;
    }
}
