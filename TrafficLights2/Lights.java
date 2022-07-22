package Abstraction.TrafficLights2;

public enum Lights {
    RED("GREEN"),GREEN("YELLOW"),YELLOW("RED");

     private String value;

    Lights(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Lights parse(String s){
        return Lights.valueOf(s);
    }

}
