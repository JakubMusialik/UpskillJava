package LambdaExpressionsPluralsight.Interface;

//@FunctionalInterface <-- w wypadku gdy jedna metoda abstrakcyjna nie ma potrzeby definiowania jako interfejs funkcyjny
//metody obiektu i metody statyczne nie wliczają się w ilość metod potrzebnych do definicji interfejsu funkcyjnego

//DOSTAWCA
public interface Supplier <T>{
    T get();
}
