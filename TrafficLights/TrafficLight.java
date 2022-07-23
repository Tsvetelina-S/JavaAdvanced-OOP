package Abstraction.TrafficLights;

public class TrafficLight {

    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public void changeLight() {
        switch (light) {
            case RED -> light = Light.GREEN;
            case GREEN -> light = Light.YELLOW;
            case YELLOW -> light = Light.RED;
        }
    }

    public Light getLight() {
        return light;
    }
}
