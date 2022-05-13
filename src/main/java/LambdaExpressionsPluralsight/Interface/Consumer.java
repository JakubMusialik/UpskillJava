package LambdaExpressionsPluralsight.Interface;

//KONSUMENT <--- przyjmuje obiekt i nie zwraca nic
public interface Consumer <T> extends java.util.function.Consumer<T> {

    @Override
    void accept(T t);

    @Override
    default java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T> after) {
        return java.util.function.Consumer.super.andThen(after);
    }
}
