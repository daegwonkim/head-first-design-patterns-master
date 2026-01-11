package headfirst.designpatterns.decorator.starbuzzcoffee;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;
import headfirst.designpatterns.decorator.starbuzzcoffee.component.DarkRoast;
import headfirst.designpatterns.decorator.starbuzzcoffee.component.Espresso;
import headfirst.designpatterns.decorator.starbuzzcoffee.component.HouseBlend;
import headfirst.designpatterns.decorator.starbuzzcoffee.decorator.Mocha;
import headfirst.designpatterns.decorator.starbuzzcoffee.decorator.Soy;
import headfirst.designpatterns.decorator.starbuzzcoffee.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.description() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.description() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.description() + " $" + beverage3.cost());
    }
}
