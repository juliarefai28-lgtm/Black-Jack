public class Player {

    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public Card [] hand;
    public String name;

    public void Hit(){

    }
    public void Stand(){

    }

    public Player(){

        isHit =false;
        isBust=false;
        cardTotal= 0;
        name = "me";
        hand = new Card[2];

    }
    public void printInfo(){

        System.out.println("Name:" + name);
        System.out.println( " Card Total: " + cardTotal);
        System.out.println( " Is Bust: "+isBust);
        System.out.println( " Is Hit: " + isHit);
        System.out.println( " Hand Size: " + hand.length);
        for (int s=0; s<hand.length; s++){
            hand[s].PrintInfo();
        }
    }
    public void calculateTotal(){
        for ( int f=0; f<hand.length; f++){
            cardTotal+=hand[f].value;
        }
    }
}
