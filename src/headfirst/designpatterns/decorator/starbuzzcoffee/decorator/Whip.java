package headfirst.designpatterns.decorator.starbuzzcoffee.decorator;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
