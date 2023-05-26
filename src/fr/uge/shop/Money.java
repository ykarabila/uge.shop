package fr.uge.shop;

import java.util.Objects;

public final class Money {
    public enum Coin {
        GOLD, SILVER, COPPER, ZERO
    }

    private final Integer g;
    private final Integer s;
    private final Integer c;

    static Money ZERO =  new Money();
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

     Money add(Integer i, Coin e) {
        Integer sum = this.g;
        if (e == Coin.GOLD) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(g, money.g) && Objects.equals(s, money.s) && Objects.equals(c, money.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g, s, c);
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
