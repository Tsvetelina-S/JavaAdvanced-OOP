package Abstraction.TrafficLights;

public class TrafficLight {

    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public void changeLight() {
        switch (light) {
            case RED:
                 light = Light.GREEN;
                 break;
            case GREEN:
                light = Light.YELLOW;
                break;
            case YELLOW:
                light = Light.RED;
                break;
        }
    }

    public Light getLight() {
        return light;
    }
}
