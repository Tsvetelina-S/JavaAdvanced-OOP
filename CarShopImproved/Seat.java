package CarShopImproved;
public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProducer, Double price) {
        super(model, color, horsePower, countryProducer);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
       return String.format("%s%n%s sells for %f",super.toString(),getModel(),price);

    }
}
