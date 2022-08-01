package CarShopExtended;

public class Audi implements Rentable{
    private final int TIRES = 4;
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProducer;
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProducer, Integer minRentDay, Double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
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
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String infoCar = String.format("This is %s produced in %s and have %d tires",model,countryProducer,this.TIRES);
        String rentalInfo = String.format("%nMinimum rental period of %d days. Price per day %f",minRentDay,pricePerDay);
        return sb.append(infoCar).append(rentalInfo).toString();

    }
}
