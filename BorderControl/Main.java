package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> players = new ArrayList<>();

        String command = scan.nextLine();

        while (!command.equals("End")) {
            String[] input = command.split("\\s+");

            Identifiable identifiable = input.length == 2
                    ? new Robot(input[0], input[1])
                    : new Citizen(input[0], Integer.parseInt(input[1]), input[2]);
            players.add(identifiable);
            command = scan.nextLine();
        }

        String fakeIdNumber = scan.nextLine();

        players
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdNumber))
                .forEach(System.out::println);

    }
}
