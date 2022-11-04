package Behavioural.ChainofResponsibility;

public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            //if eligible request
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription() + request.getValue());
        }
    }
}
