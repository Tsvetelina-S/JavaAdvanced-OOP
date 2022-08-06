package Abstraction.TrafficLights2;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        addToList(in,n);
    }
    private static void addToList(String in, int n) {
        List<String> input = Arrays.stream(in.split("\\s+")).toList();
        rotateTrafficLights(input,n-1);

    }
    private static void rotateTrafficLights(List<String> input, int n) {
        if (n >= 0) {
            TrafficLight trafficLight = new TrafficLight();
            for (String inputData : input) {
                Lights light = Lights.parse(inputData);
                trafficLight.add(light);
            }
            String result = trafficLight.changeLights();
            System.out.println(result);
            addToList(result,n);
        }
    }
}
