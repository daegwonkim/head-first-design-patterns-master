package headfirst.designpatterns.factory.pizzafactorymethod.store;

import headfirst.designpatterns.factory.pizzafactorymethod.pizza.Pizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.ny.NYStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.ny.NYStyleClamPizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.ny.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
