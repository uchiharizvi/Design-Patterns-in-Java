package Behavioural.Strategy.Example002.JDK7;

import java.math.BigDecimal;

public class StrategyClient {
    public static void main(String[] args) {

        Discounter easterDiscounter = new EasterDiscounter();
        BigDecimal discount = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Easter Discount : " + discount);

        Discounter christmasDiscounter = new ChristmasDiscounter();
        BigDecimal discount2 = christmasDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Christmas Discount : " + discount2);
    }
}
