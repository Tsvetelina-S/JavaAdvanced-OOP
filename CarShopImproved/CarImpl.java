package CarShopImproved;

public class CarImpl implements Car{

    private static int TIRES = 4;

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProducer;


    public CarImpl (String model, String color, Integer horsePower, String countryProducer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
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
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",getModel(),countryProduced(),TIRES);
    }
}
