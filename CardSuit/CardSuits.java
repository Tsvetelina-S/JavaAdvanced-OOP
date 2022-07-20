package Abstraction.CardSuit;

public enum CardSuits {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), name());
    }
}

