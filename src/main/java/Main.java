import HashMap.HashyMap;
import HashSet.HashySet;
import LinkedList.LinkyList;


public class Main {
    public static void main(String[] args) {
        System.out.println("MAP");
        HashyMap<Integer, String> map = new HashyMap<>();
        map.add(1,"1");
        map.add(122, "2");
        map.add(1262, "3");
        map.forEach(System.out::println);
        System.out.println("SET");
        HashySet<Integer> set = new HashySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.forEach(System.out::println);
        System.out.println("LIST");
        LinkyList<Integer> list = new LinkyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(System.out::println);
    }
}
