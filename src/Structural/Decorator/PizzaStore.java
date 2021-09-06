package Structural.Decorator;

import Structural.Decorator.Toppings.FreshTomato;
import Structural.Decorator.Toppings.Paneer;

public class PizzaStore {
    public static void main(String[] args) {
        // create new peppy paneer pizza
        Pizza peppyPaneer = new PeppyPaneer();
        System.out.println(peppyPaneer.getDescription() +
                " Cost :" + peppyPaneer.getCost());

        // create new FarmHouse pizza
        Pizza farmhouse = new Farmhouse();
        // decorate it with fresh tomato topping
        farmhouse = new FreshTomato(farmhouse);
        //decorate it with paneer topping
        farmhouse = new Paneer(farmhouse);

        System.out.println(farmhouse.getDescription() +
                " Cost :" + farmhouse.getCost());

    }
}
