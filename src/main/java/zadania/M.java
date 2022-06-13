package zadania;

public class M {
    public static void main(String[] args) {

    String[] tab = {"f","o","o","bar"};

        System.out.println(stringBuilder(tab));

    }

    public static String stringBuilder(String[] tab){
        return String.join("",tab);
    }
}
