public class Card {

    public String Suit;
    public String name;
    public int value;


    // todo: make a constructer that has three parameters one for each variable
    public Card(int pSuit, int pName, int pValue) {
        if (pSuit == 0) {
            Suit = "hearts";
        } else if (pSuit == 1) {
            Suit = "Diamonds";
        } else if (pSuit == 2) {
            Suit = "Cloves";
        } else if (pSuit == 3) {
            Suit = "Spades";
        }

        if (pName == 0) {
            name = "Ace";
            value = 11;
        } else if (pName == 1) {
            name = "Two";
            value = 2;
        } else if (pName == 2) {
            name = "Three";
            value = 3;
        } else if (pName == 4) {
            name = "Four";
            value = 4;
        } else if (pName == 5) {
            name = "Five";
            value = 5;
        } else if (pName == 6) {
            name = "Six";
            value = 5;
        } else if (pName == 7) {
            name = "Seven";
            value = 7;
        } else if (pName == 8) {
            name = "Eight";
            value = 8;
        } else if (pName == 9) {
            name = "Nine";
            value = 9;
        } else if (pName == 10) {
            name = "Jack";
            value = 10;
        } else if (pName == 11) {
            name = "Queen";
            value = 11;
        } else if ( pName == 12){
            name = "King";
            value = 12;
        }
    }
        public void PrintInfo () {

            System.out.println(" the " + name + " of " + Suit + " is worth " + value + " points ");
        }

    }

