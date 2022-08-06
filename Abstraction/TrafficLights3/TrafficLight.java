package Abstraction.TrafficLights3;

public enum TrafficLight {
    RED("GREEN"),GREEN("YELLOW"),YELLOW("RED");

    private String value;

    TrafficLight(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void changeLight(String lights, int n) {
        if (n > 0) {
            StringBuilder sb = new StringBuilder();
            for (String input : lights.split("\\s+")) {
                String newLight = TrafficLight.valueOf(input).getValue() + " ";
                System.out.print(newLight);
                sb.append(newLight);
            }
            n--;
            System.out.println();
            changeLight(sb.toString(), n);
        }
    }
}
