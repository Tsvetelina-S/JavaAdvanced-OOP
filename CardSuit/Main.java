package Abstraction.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        if(command.equals("Card Suits")) {
            System.out.println("Card Suits:");
            for (CardSuits card : CardSuits.values()) {
                System.out.println(card);
            }
        }
    }
}
