package headfirst.designpatterns.decorator.starbuzzcoffee.decorator;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", 우유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
