import java.util.Scanner;

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

        me.hand[0]= deck[0];
        me.hand[1]= deck[1];
        me.calculateTotal();

        d.hand[0]= deck[2];
        d.hand[1]=deck[3];
        d.calculateTotal();
        d.printInfo();

        //ask the user questions

        Scanner s = new Scanner(System.in);
        System.out.println( "what is your name?");
        String name = s.nextLine();
        System.out.println(name);
        me.name = name;
        me.printInfo();


        System.out.println( " Do you want to hit or stay ?");
        String Hit = s.nextLine();
        System.out.println( " Hit or Stay "+Hit);
        if ( Hit.equals("Hit")){
         me.isHit=true;
            me.printInfo();
        }
       if (Hit.equals("Hit")){
           me.hand[2]=deck[4];
           me.calculateTotal();me.printInfo();
       }
       if (Hit.equals("Stay")){
           System.out.println("You stayed");
           d.printInfo();
       }

        }


        public void printDeck(){
        for (int i=0; i<deck.length;i++){
                deck[i].PrintInfo();
            }
        }
        }

