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


    }
}
