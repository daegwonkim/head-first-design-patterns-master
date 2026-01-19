package headfirst.designpatterns.factory.pizzafactorymethod.store;

import headfirst.designpatterns.factory.pizzafactorymethod.pizza.Pizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.chicago.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.chicago.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafactorymethod.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        if (item.equals("cheese")) {
                return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
                return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
                return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
                return new ChicagoStylePepperoniPizza();
        } else return null;
	}
}
