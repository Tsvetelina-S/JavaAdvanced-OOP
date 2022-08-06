package Abstraction.CardsWithPower_2;

public enum SuitPower {
    CLUBS(0),DIAMONDS(13),HEARTS(26),SPADES(39);

    public int value;

    SuitPower(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SuitPower parse (String s){
        return SuitPower.valueOf(s);
    }
}
