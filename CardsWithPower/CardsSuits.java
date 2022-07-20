package Abstraction.CardsWithPower;

public enum CardsSuits {
    CLUBS(0),DIAMONDS(13),HEARTS(26),SPADES(39);

    public int value;

    CardsSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CardsSuits parse (String s){
        return CardsSuits.valueOf(s);
    }
}
