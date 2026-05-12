public class BasicGameApp {

    public Card[] deck;
    public Player me;
    public Dealer d;

    public void Compare(){

    }
    public void round(){

    }
    public void Shuffle(){
        for (int x=0; x< deck.length; x++){
            int randomIndex = (int)(Math.random()*52);
            Card Spencer = deck[randomIndex];
            deck[randomIndex]= deck[x];
            deck[x]=Spencer;
        }

    }

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp(){
        System.out.println("welcome to blackjack");
        deck= new Card[52];

        int counter=0;
        for ( int y=0; y<4; y++)
        for ( int i=0;  i<13; i++){
          deck[counter]= new Card(y, i,10);
          counter++;
        }
        Shuffle();
        printDeck();
        me=new Player();
        d = new Dealer();

        }

        public void printDeck(){
        for (int i=0; i<deck.length;i++){
                deck[i].PrintInfo();
            }
        }
        }

