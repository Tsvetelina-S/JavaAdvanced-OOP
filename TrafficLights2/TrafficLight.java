package Abstraction.TrafficLights2;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
   private List<Lights> lights;

    public TrafficLight() {
        this.lights = new ArrayList<>();
    }
    public void add (Lights lights){
        this.lights.add(lights);
    }

    public String changeLights() {
        StringBuilder sb = new StringBuilder();
        for (Lights light: this.lights) {
            sb.append(light.getValue() + " ");
        }
        return sb.toString();
    }

}
