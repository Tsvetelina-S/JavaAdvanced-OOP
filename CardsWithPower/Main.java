package Abstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rank = scan.nextLine();
        String suit = scan.nextLine();
        Card card1 = new Card(CardsRanks.parse(rank),CardsSuits.parse(suit));
        System.out.printf("Card name: %s of %s; Card power: %d", card1.getCardsRanks(),card1.getCardsSuits(),card1.powerOfCard());
    }
}
