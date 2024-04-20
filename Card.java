public class Card {

    private String cardSuit;
    private int cardNumber;

    public Card(int cardNumber, String cardSuit) {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardNumber(int cardNumber) {
        if (cardNumber < 1 || cardNumber > 13) {
            cardNumber = 1;
        }
        this.cardNumber = cardNumber;
    }

    public void setCardSuit(String cardSuit) {
        cardSuit = cardSuit.toLowerCase();
        if (!cardSuit.equals("spades") && !cardSuit.equals("hearts") && !cardSuit.equals("diamonds")
                && !cardSuit.equals("clubs")) {
            cardSuit = "spades";
        }
        this.cardSuit = cardSuit;
    }

    public void printCard() {
        if (cardNumber >= 2 && cardNumber <= 10) {
            System.out.println(cardNumber + " of " + cardSuit);
        } else if (cardNumber == 1) {
            System.out.println("Ace of " + cardSuit);
        } else if (cardNumber == 11) {
            System.out.println("Jack of " + cardSuit);
        } else if (cardNumber == 12) {
            System.out.println("Queen of " + cardSuit);
        } else if (cardNumber == 13) {
            System.out.println("King of " + cardSuit);
        }
    }
}
