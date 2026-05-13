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
        isBust=true;
        cardTotal= 52;
        name = "Player";
        hand = new Card[10];

    }
    public void printInfo(){

        System.out.println("Name:" + name);
        System.out.println( " Card Total: " + cardTotal);
        System.out.println( " Is Bust: "+isBust);
        System.out.println( " Is Hit: " + isHit);
        System.out.println( " Hand Size: " + hand.length);
    }
}
