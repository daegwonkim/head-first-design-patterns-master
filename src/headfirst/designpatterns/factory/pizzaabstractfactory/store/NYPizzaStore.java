package headfirst.designpatterns.factory.pizzaabstractfactory.store;

import headfirst.designpatterns.factory.pizzaabstractfactory.factory.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaabstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaabstractfactory.pizza.*;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory;
        ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
