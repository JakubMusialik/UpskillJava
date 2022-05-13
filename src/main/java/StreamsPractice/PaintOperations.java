package StreamsPractice;

import StreamsPractice.Objects.Paint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class PaintOperations {

    public static List<Paint> fillUpListWithPaint(List<Paint> paintList) {
        paintList.add(new Paint("Red", 5, 30));
        paintList.add(new Paint("Red", 80, 20));
        paintList.add(new Paint("Red", 65, 10));
        paintList.add(new Paint("Blue", 120, 40));
        paintList.add(new Paint("Blue", 100, 20));
        paintList.add(new Paint("Blue", 85, 10));
        paintList.add(new Paint("Yellow", 115, 35));
        paintList.add(new Paint("Yellow", 90, 25));
        paintList.add(new Paint("Yellow", 50, 5));
        paintList.add(new Paint("White", 150, 25));
        paintList.add(new Paint("White", 130, 20));
        paintList.add(new Paint("White", 100, 15));

        return paintList;
    }

    public static void changeColorPrice(List<Paint> paintList, String color, int newPrice) {
        paintList.stream()
                .filter(paint -> paint.getColor().equals(color))
                .map(paint -> {
                    paint.setPrice(newPrice);
                    return paint;
                })
                .forEach(System.out::println);
    }

    public static void changeSizePrice(List<Paint> paintList, int size, int newPrice) {

        paintList.stream().filter(paint -> paint.getSize() == size)
                .map(paint -> {
                    paint.setPrice(newPrice);
                    return paint;
                })
                .forEach(System.out::println);
    }

    public static void findPaintsByColor(List<Paint> paintList, String color) {

        paintList.stream()
                .filter(paint -> paint.getColor().equals(color))
                .map( paint -> paint.toString())
                .sorted(Comparator.reverseOrder())
//               .peek(System.out::println)
                .forEach(System.out::println);
    }

    public static void findPaintSizeByColorAndPrice(List<Paint> paintList,String color,int price){

        paintList.stream().filter(paint -> paint.getColor().equals(color))
                .filter(paint -> paint.getPrice() == price)
                .sorted()
                .forEach(System.out::println);
    }

    public static void findCheapestPaint(List<Paint> paintList){

        Optional<Paint> first = paintList.stream()
                .min(Comparator.comparingInt(Paint::getPrice));

        System.out.println(first);

    }

    public static void findTheMostExpensivePaint(List<Paint> paintList){
        Optional<Paint> max = paintList.stream().max(Comparator.comparingInt(Paint::getPrice));

        System.out.println(max);
    }


    public static void main(String[] args) {
        List<Paint> paintList = new ArrayList<>();

        fillUpListWithPaint(paintList);

        findPaintsByColor(paintList, "Red");
        System.out.println("-------------------------");
        findPaintsByColor(paintList, "White");
        System.out.println("-------------------------");
        changeColorPrice(paintList,"Red",90);
        System.out.println("-------------------------");
        changeSizePrice(paintList,25,10);
        System.out.println("-------------------------");
        findPaintSizeByColorAndPrice(paintList,"White",10);
        System.out.println("-------------------------");
        findCheapestPaint(paintList);
        System.out.println("-------------------------");
        findTheMostExpensivePaint(paintList);
    }
}