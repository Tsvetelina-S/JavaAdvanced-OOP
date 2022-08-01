package CarShop;

public class Seat implements Car{
    private static final int TIRES = 4;
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProducer;

    public Seat(String model, String color, Integer horsePower, String countryProducer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProducer;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",model,countryProducer,Seat.TIRES);
    }
}
