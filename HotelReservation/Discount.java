package Abstraction.HotelReservation;

public enum Discount {
    None(1),SecondVisit(0.90),VIP(0.80);

    private double value;

    Discount(double value){
    this.value = value;
    }

    public static Discount parse(String s) {
        switch (s){
            case "VIP":
                return VIP;
                case "SecondVisit":
                    return SecondVisit;
                    case "None":
                return None;
            default:
                throw new IllegalArgumentException("Unknown enum value" + s);
            }
        }

    public double getValue(){
        return this.value;
    }
}