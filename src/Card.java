public class Card {

    public String Suit;
    public String name;
    public int value;


    // todo: make a constructer that has three parameters one for each variable
    public Card(String pSuit, int pName, int pValue) {
        Suit = pSuit;

        if (pName == 0) {
            name = "Ace";
            value = 11;
        } else if (pName == 1) {
            name = "Two";
            value = 2;
        } else if (pName == 2) {
            name = "Three";
            value = 3;
        }
    }
    // todo: make a print info that prints the info of the card
    public void PrintInfo(){

        System.out.println("the" +name + "of" + Suit + "is worth" + value +"points");
    }

}
