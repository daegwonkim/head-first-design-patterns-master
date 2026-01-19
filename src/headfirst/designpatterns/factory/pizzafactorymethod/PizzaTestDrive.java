package headfirst.designpatterns.factory.pizzafactorymethod;

import headfirst.designpatterns.factory.pizzafactorymethod.pizza.Pizza;
import headfirst.designpatterns.factory.pizzafactorymethod.store.ChicagoPizzaStore;
import headfirst.designpatterns.factory.pizzafactorymethod.store.NYPizzaStore;
import headfirst.designpatterns.factory.pizzafactorymethod.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
