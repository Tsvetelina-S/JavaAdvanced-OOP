package Abstraction.CardsWithPower_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rankOfTheCard = scan.nextLine();
        String suitOfTheCard = scan.nextLine();
        RankPower rankPower = RankPower.parse(rankOfTheCard);
        SuitPower suitPower = SuitPower.parse(suitOfTheCard);

        int powerOfACard = rankPower.value + suitPower.value;
        System.out.printf("Card name: %s of %s; Card power: %d",rankOfTheCard,suitOfTheCard,powerOfACard);

    }
}
