package StreamsPractice;

import StreamsPractice.Objects.Human;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class StreamsPractice {
    public static void main(String[] args) {

        var list = List.of(1, 2, 3, 4, 5);

//        list.stream().map(Object::toString);

        list.stream().filter(value -> value % 2 == 0)
                .forEach(System.out::println);

        list.stream().map(Objects::toString).collect(Collectors.toList());
        System.out.println("------------------------");

        var stringList = List.of("Apple", "Orange", "Strawberry", "Banana", "Blueberry", "Lemon");
        List<String> berryList = stringList.stream().filter(string -> string.contains("berry")).toList();
        berryList.forEach(System.out::println);
        System.out.println("------------------------");
        boolean anyMatch = stringList.stream()
                .anyMatch(value -> value.equals("Banana"));
        System.out.println(anyMatch);

        System.out.println("------------------------");
        boolean isThereStrawberry = stringList.stream().filter(value -> value.endsWith("y"))
                .toList()
                .contains("Strawberry");
        System.out.println(isThereStrawberry);
        System.out.println("------------------------");

        var humanList = List.of(
                new Human(55,195,90,"Jan","Kowalski","Man"),
                new Human(33, 153,75,"Mariola","Kowalska","Woman"),
                new Human(80,160,90,"Robert","Burnejka","Man"),
                new Human(12,198,150,"Pamela","Anderson","Woman"),
                new Human(25, 187,65,"Robert","Downey Jr","Man"));

        List<String> over50yearsAge = humanList.stream()
                .filter(human -> human.getAge() > 50)
                .map(Human::getSurname).toList();

        over50yearsAge.stream().sorted().forEach(System.out::println);

        System.out.println("------------------------");

        humanList.stream()
                .sorted(Comparator.comparing(Human::getWeight)
                        .thenComparing(Human::getHeight))
                .limit(2).map(Human::getSurname)
                .forEach(System.out::println);
        System.out.println("------------------------");

        humanList.stream().filter(human -> human.getAge() < 35)
                .sorted(Comparator.comparing(Human::getSex)
                        .reversed()).map(Human::getSurname).forEach(System.out::println);




        //        System.out.println("MAP")
        //        HashyMap<Integer, String> map = new HashyMap<>();
//        map.add(1,"1");
//        map.add(122, "2");
//        map.add(1262, "3");
//        map.forEach(System.out::println);
//        System.out.println("SET");
//        HashySet<Integer> set = new HashySet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.forEach(System.out::println);
//        System.out.println("LIST");
//        LinkyList<Integer> list = new LinkyList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.forEach(System.out::println);
    }
}