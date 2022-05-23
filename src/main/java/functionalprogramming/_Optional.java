package functionalprogramming;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        Optional.ofNullable("a@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to: " + email),
                        () -> {
                            System.out.println("Cannot send email");  // <-- invoked when null instead of mail
                        });
    }
}
