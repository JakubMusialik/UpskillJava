package functionalprogramming.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneValid(String phone){
        return phone.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
     return  isEmailValid(customer.getEmail()) && isPhoneValid(customer.getPhoneNo()) && isAdult(customer.getDob());
    }
}
