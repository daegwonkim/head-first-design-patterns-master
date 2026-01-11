package headfirst.designpatterns.decorator.starbuzzcoffee.decorator;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
