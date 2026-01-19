package headfirst.designpatterns.factory.pizzaabstractfactory.factory;

import headfirst.designpatterns.factory.pizzaabstractfactory.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
