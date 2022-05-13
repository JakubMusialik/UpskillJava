package StreamsPractice.Objects;

public class Paint {

    String color;
    int price;
    int size;

    public Paint(String color,
                 int price,
                 int size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
