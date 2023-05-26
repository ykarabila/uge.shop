package fr.uge.shop;

public final class Money {
    public enum Coin {
        GOLD, SILVER, COPPER
    }

    private final Integer g;
    private final Integer s;
    private final Integer c;

    Money() {
        this.c = 0;
        this.g = 0;
        this.s = 0;
    }
    Money(Integer g){
        this.c = 0;
        this.g = g;
        this.s = 0;
    }

     Money add(Integer i, String e) {
        Integer sum = this.g;
        if (e == String.valueOf(Coin.GOLD)) {
            sum +=i;

        }
        return new Money(sum);
    }

    public Integer getG() {
        return g;
    }

    public Integer getS() {
        return s;
    }

    public Integer getC() {
        return c;
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
