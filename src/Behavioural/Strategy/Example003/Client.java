package Behavioural.Strategy.Example003;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 10));
        cart.addItem(new Item("5678", 40));
        cart.pay(new PayPalStrategy("myEmail@Example.com", "pwd"));
        cart.pay(new CreditCardStrategy("Example Kumar", "xxxxxxxxxxxxxxxx","xxx","12/23"));
    }
}
