package com.mycompany.app;

import java.time.LocalDate;
import java.time.Period;

import static com.mycompany.app.CostumerValidationResult.*;

public class CostumerValidatorService implements CustomerRegistrationValidator {
    private CustomerRegistrationValidator isValidEmail() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : INVALID_EMAIL;
    }

    private CustomerRegistrationValidator isValidFirstName() {
        return customer -> customer.getFirstName().trim().isBlank() ? INVALID_FIRST_NAME : SUCCESS;
    }

    private CustomerRegistrationValidator isValidLastName() {
        return customer -> customer.getLastName().trim().isBlank() ? INVALID_LAST_NAME : SUCCESS;
    }

    private CustomerRegistrationValidator isValidPhoneNumber() {
        return customer -> customer.getPhoneNumber().startsWith("+") ? SUCCESS : INVALID_PHONE_NUMBER;
    }

    private CustomerRegistrationValidator isValidAge() {
        return customer -> Period.between(customer.getAge(), LocalDate.now()).getYears() > 16 ? SUCCESS : INVALID_AGE;
    }

    @Override
    public CostumerValidationResult apply(Customer customer) {
        return isValidEmail()
                .and(isValidFirstName())
                .and(isValidLastName())
                .and(isValidPhoneNumber())
                .and(isValidAge())
                .apply(customer);
    }
}
