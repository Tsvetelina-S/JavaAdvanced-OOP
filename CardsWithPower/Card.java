package Abstraction.CardsWithPower;

public class Card {
    private CardsRanks cardsRanks;
    private CardsSuits cardsSuits;

    public Card(CardsRanks cardsRanks, CardsSuits cardsSuits) {
        this.cardsRanks = cardsRanks;
        this.cardsSuits = cardsSuits;
    }

    public CardsRanks getCardsRanks() {
        return cardsRanks;
    }

    public CardsSuits getCardsSuits() {
        return cardsSuits;
    }
    public int powerOfCard (){
        return this.cardsRanks.value + this.cardsSuits.value;
    }
}
