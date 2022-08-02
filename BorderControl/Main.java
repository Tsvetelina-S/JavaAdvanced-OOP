package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> players = new ArrayList<>();

        String command = scan.nextLine();

        while(!command.equals("End")){
            String [] input = command.split("\\s+");

            Identifiable identifiable = input.length == 2
                    ? new Robot(input[1],input[0])
                    : new Citizen(input[0],Integer.parseInt(input[1]),input[2]);
            players.add(identifiable);
           // players.add(robotsAndCitizens(input));
            command = scan.nextLine();
        }

        String fakeIdNumber = scan.nextLine();

        players
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdNumber))
                .forEach(System.out::println);

       // List<Identifiable> detained;

     //  detained = detainedPlayers(players,fakeIdNumber);

//        for (Identifiable detainedPlayer : detained) {
//            System.out.println(detainedPlayer.getId());
//        }
    }

//    private static List<Identifiable> detainedPlayers(List<Identifiable> players, String fakeIdNumber) {
//        List<Identifiable> detained = new ArrayList<>();
//        for (Identifiable player: players) {
//            String number = player.getId();
//            String lastDigits = number.substring((number.length() - fakeIdNumber.length()));
//            if(lastDigits.equals(fakeIdNumber)){
//                detained.add(player);
//            }
//        }
//        return detained;
//    }

//    private static Identifiable robotsAndCitizens (String[] input) {
//        if(input.length == 2){
//            String model = input[0];
//            String id = input[1];
//            return new Robot (id,model);
//        }else{
//            String name = input[0];
//            int age = Integer.parseInt(input[1]);
//            String id = input[2];
//            return new Citizen(name,age,id);
//        }
//    }
}
