public class BasicGameApp {

    public Card[] deck;
    public Player me;
    public Dealer d;

    public void Compare(){

    }
    public void round(){

    }
    public void Shuffle(){

    }
    public void shuffle(){

    }

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp(){
        System.out.println("welcome to blackjack");
        deck= new Card[52];

        for ( int i=0;  i<13; i++){
          deck[i]= new Card("heart", i,10);
        }

        printDeck();

        }

        public void printDeck(){
        for (int i=0; i<deck.length;i++){
            if (deck[i] !=null){
                deck[i].PrintInfo();
            }
        }
        }
    }
