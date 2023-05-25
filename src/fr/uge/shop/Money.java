package fr.uge.shop;

public class Money {


    public enum Coin {
        GOLD, SILVER, COPPER
    }

    private Integer g,s,c;
    public Money(){
        this.c=this.g=this.s=0;
    }

    public Money add(Integer i, String e){
        if(e == String.valueOf(Coin.GOLD)){
            this.g += i;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Money{" +
                "g=" + g +
                ", s=" + s +
                ", c=" + c +
                '}';
    }
}
