package LambdaExpressionsPluralsight.Interface;

//FUNKCJA <-- przyjmuje obiekt typu T i zwraca obiekt typu R
//Zastosowanie w mapowaniu streamów
public interface Function <T,R>{

    R apply(T t);
}
