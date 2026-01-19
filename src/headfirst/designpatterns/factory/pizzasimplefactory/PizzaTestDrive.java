package headfirst.designpatterns.factory.pizzasimplefactory;

import headfirst.designpatterns.factory.pizzasimplefactory.factory.SimplePizzaFactory;
import headfirst.designpatterns.factory.pizzasimplefactory.pizza.Pizza;
import headfirst.designpatterns.factory.pizzasimplefactory.store.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
