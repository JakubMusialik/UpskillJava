package LambdaExpressionsPluralsight.Operations.Chaining;

import LambdaExpressionsPluralsight.Object.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {
    public static void main(String[] args) {

        User jakub = new User("Jakub",20);
        User michal = new User("Michal",37);
        User filip = new User("Filip",52);
        User tomek = new User("Tomek",12);
        User arek = new User("Arek",95);

        List<User> users = Arrays.asList(jakub,michal,filip,tomek,arek);
//        sortowanie alfabetyczne
        Comparator<User> compareName =  Comparator.comparing(user -> user.getName());
        users.sort(compareName);
        users.forEach(System.out::println);

//        sortowanie wg wieku
        Comparator<User> compareAge = Comparator.comparingInt(user -> user.getAge());
        users.sort(compareAge);
        users.forEach(System.out::println);

//        chaining powyzszych comparatorow
        Comparator<User> chainedComparator = compareName.thenComparing(compareAge);
        users.sort(chainedComparator);
        users.forEach(System.out::println);

//        odwrocenie comparatora
        Comparator<User> reversed = chainedComparator.reversed();
        users.sort(reversed);
        users.forEach(System.out::println);
    }
}
