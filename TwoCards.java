public class TwoCards {
    public static void main(String[] args) {
        Card card1 = new Card(0, null);
        Card card2 = new Card(0, null);
        int randomSuit1, randomNumber1, randomSuit2, randomNumber2;

        randomSuit1 = (int) (Math.random() * 4);
        randomNumber1 = (int) (Math.random() * 13 + 1);

        switch (randomSuit1) {
            case 0:
                card1.setCardSuit("spades");
                break;
            case 1:
                card1.setCardSuit("hearts");
                break;
            case 2:
                card1.setCardSuit("diamonds");
                break;
            case 3:
                card1.setCardSuit("clubs");
                break;
        }
        card1.setCardNumber(randomNumber1);

        randomSuit2 = (int) (Math.random() * 4);
        randomNumber2 = (int) (Math.random() * 13 + 1);

        while (randomSuit1 == randomSuit2 && randomNumber1 == randomNumber2) {
            randomSuit2 = (int) (Math.random() * 4);
            randomNumber2 = (int) (Math.random() * 13 + 1);
        }

        switch (randomSuit2) {
            case 0:
                card2.setCardSuit("spades");
                break;
            case 1:
                card2.setCardSuit("hearts");
                break;
            case 2:
                card2.setCardSuit("diamonds");
                break;
            case 3:
                card2.setCardSuit("clubs");
                break;
        }
        card2.setCardNumber(randomNumber2);

        card1.printCard();
        card2.printCard();

    }
}
