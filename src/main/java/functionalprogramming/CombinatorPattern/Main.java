package functionalprogramming.CombinatorPattern;

import java.time.LocalDate;

import static functionalprogramming.CombinatorPattern.CustomerRegValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "a@gmail.com",
                "+0214615",
                LocalDate.of(2000,1,1));


        //Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
