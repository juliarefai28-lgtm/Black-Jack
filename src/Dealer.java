public class Dealer {

    public Boolean Over15;
    public int cardTotal;
    public Boolean isBust;
    public int total;

    public Card[] hand;
    public void Hit(){

    }
    public void Stand(){

    }
    public Dealer(){

        Over15= false;
        isBust= false;
        cardTotal= 52;
        hand= new Card[12];
    }
    public void printInfo(){

        System.out.println( "Over15: " + Over15);
        System.out.println( "Card Total: " + cardTotal);
        System.out.println( "Is Bust:" + isBust);
        System.out.println( " Hand Size: "+ hand.length);
    }

    public void calculateTotal(){
        total=0;
        for (int i=0; i< hand.length;i++){
            if(hand[i] !=null){
                total=total+hand[i].value;
            }
        }

    }

}
