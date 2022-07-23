package Abstraction.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> lights = Arrays.stream(scan.nextLine().split("\\s+")).toList();
        int n = Integer.parseInt(scan.nextLine());
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String light : lights) {
            TrafficLight trafficLight = new TrafficLight(Light.valueOf(light));
            trafficLights.add(trafficLight);
        }
        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficL : trafficLights) {
                trafficL.changeLight();
                System.out.print(trafficL.getLight() + " ");
            }
            System.out.println();
        }
    }

}