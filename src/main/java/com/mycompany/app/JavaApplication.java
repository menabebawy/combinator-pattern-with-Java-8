package com.mycompany.app;

import java.time.LocalDate;

public class JavaApplication {
    public static void main(String[] args) {
        Customer costumer = new Customer(
                "test@test.com",
                "+43001010101",
                "FirstName",
                "LastName",
                LocalDate.of(1986, 3, 11)
        );
        System.out.println(new CostumerValidatorService().apply(costumer));
    }
}
