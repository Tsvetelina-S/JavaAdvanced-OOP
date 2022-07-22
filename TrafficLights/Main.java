package Abstraction.TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lights = scan.nextLine();

        int n = Integer.parseInt(scan.nextLine());

        TrafficLight.changeLight(lights,n);

    }
}
