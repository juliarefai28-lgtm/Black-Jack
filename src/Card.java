public class Card {

    public String Suit;
    public String name;
    public int value;


    // todo: make a constructer that has three parameters one for each variable
    public Card(String pSuit, String pName, int pValue) {
        name = pName;
        value = pValue;
        Suit =pSuit;

        if (pName == 0){
            name = "Ace";
            value = 11;
        }
        else if (pName == 1){
            name = "two";
            value = 2;
        }
    }
    // todo: make a print info that prints the info of the card
    public void PrintInfo(){

        System.out.println("the" +name + "of" + Suit + "is worth" + value +"points");
    }

}
