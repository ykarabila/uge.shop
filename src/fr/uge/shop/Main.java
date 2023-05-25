package fr.uge.shop;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Money money1 = new Money();
        System.out.println(money1);  // 0g 0s 0c
        Money money2 = money1.add(2, String.valueOf(Money.Coin.GOLD));
        System.out.println(money2);  // 2g 0s 0c

        var money3 = money2.add(3, String.valueOf(Money.Coin.GOLD));

        System.out.println(money3);  // 5g 0s 0c
    }
}