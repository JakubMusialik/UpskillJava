package LambdaExpressionsPluralsight.Operations;

import LambdaExpressionsPluralsight.Interface.Function;
import LambdaExpressionsPluralsight.Object.User;

import java.util.ArrayList;
import java.util.List;

public class Mapping {
    public static void main(String[] args) {

        User jakub = new User("Jakub");
        User michal = new User("Michał");
        User filip = new User("Filip");
        User tomek = new User("Tomek");
        User arek = new User("Arek");


        List<User> users = List.of(jakub, michal, filip, tomek, arek);
        List<String> names = new ArrayList<>();

        Function<User, String> getName = user -> user.getName();

        for (User user : users) {
            String applyName = getName.apply(user);
            names.add(applyName);
        }

        users.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
