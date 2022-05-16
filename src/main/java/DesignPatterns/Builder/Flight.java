package DesignPatterns.Builder;

public class Flight {

    private String from;
    private String to;
    private int price;
    private boolean delayed;


    public Flight(FlightBuilder flightBuilder) {
        this.from = flightBuilder.from;
        this.to = flightBuilder.from;
        this.delayed = flightBuilder.delayed;
        this.price = flightBuilder.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightBuilder {

        private final String from;
        private final String to;
        private int price;
        private final boolean delayed;

        public FlightBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightBuilder price(int price) {
            this.price = price;
            return this;
        }

        public Flight build() {
            if (price == 0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new Flight(this);
        }
    }
}
