package fr.uge.shop;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        var money1 = new Money();

        var money2 = money1.add(2, Money.Coin.GOLD);

        var money3 = money2.add(3, Money.Coin.GOLD);
        System.out.println(money1);  // 0g 0s 0c
        System.out.println(money2);  // 2g 0s 0c
        System.out.println(money3);  // 5g 0s 0c
        System.out.println("===========================================");


        var money4 = Money.ZERO;
        var money5 = Money.ZERO.add(7, Money.Coin.GOLD);
        System.out.println(money4.equals(new Money()));  // true
        System.out.println(money5.equals(Money.ZERO.add(7, Money.Coin.GOLD)));  // true
        System.out.println(money5.hashCode() == Money.ZERO.add(7, Money.Coin.GOLD).hashCode());  // true

    }
}