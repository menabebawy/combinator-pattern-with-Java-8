package com.mycompany.app;

import java.util.function.Function;

import static com.mycompany.app.CostumerValidationResult.SUCCESS;

public interface CustomerRegistrationValidator extends Function<Customer, CostumerValidationResult> {
    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            final CostumerValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }
}
