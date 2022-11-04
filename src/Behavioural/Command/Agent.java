package Behavioural.Command;

import java.util.ArrayList;
import java.util.List;

/**Invoker Class**/
class Agent {
    private List<Order> ordersQueue = new ArrayList();
    public Agent(){}
    void placeOrder (Order order){
        ordersQueue.add(order);
        //order.execute(ordersQueue.get);
    }
}
