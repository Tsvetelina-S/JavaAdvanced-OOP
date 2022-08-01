package CarShopExtended;

public class Seat implements Sellable {
    private final int TIRES = 4;
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProducer;
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProducer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
    }

    public Seat(String model, String color, Integer horsePower, String countryProducer, Double price) {
        this(model,color, horsePower,countryProducer);
        this.price = price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return countryProducer;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String infoCar = String.format("This is %s produced in %s and have %d tires",model,countryProducer,this.TIRES);
        String infoPrice = String.format("%n%s sells for %f",model,price);
        return sb.append(infoCar).append(infoPrice).toString();
    }
}
