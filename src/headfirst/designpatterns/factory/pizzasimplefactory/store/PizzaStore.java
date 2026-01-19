package headfirst.designpatterns.factory.pizzasimplefactory.store;

import headfirst.designpatterns.factory.pizzasimplefactory.factory.SimplePizzaFactory;
import headfirst.designpatterns.factory.pizzasimplefactory.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
