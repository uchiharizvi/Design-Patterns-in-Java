# Strategy Pattern Implementation

Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the 
algorithm to be used as a parameter. One of the best example of strategy pattern is Collections.sort() method that 
takes Comparator parameter.

For our example, we will try to implement a 
simple Shopping Cart where we have two 
payment strategies - using Credit Card or 
using PayPal. 

### PaymentStrategy.java
First of all we will create
the interface for our strategy
pattern example, in our case to pay the
amount passed as argument.
### CreditCardStrategy.java
Now we will have to create concrete
implementation of algorithms for payment using credit/debit card or through
paypal. 
### PayPalStrategy.java
Now we will have to create concrete
implementation of algorithms for payment using credit/debit card or through
paypal. 
### Item.java
Products to be added to cart
### ShoppingCart.java
Now our strategy pattern example algorithms are ready. We can implement Shopping Cart and payment method will
require input as Payment strategy.
