package LambdaExpressionsPluralsight.Interface;

//PREDYKAT <-- przyjmuje obiekt , przeprowadza zdefiniowany test i zwraca True/False
//Zastosowanie w filtrowaniu streamów
public interface Predicate <T>{

    boolean test(String s);
}
