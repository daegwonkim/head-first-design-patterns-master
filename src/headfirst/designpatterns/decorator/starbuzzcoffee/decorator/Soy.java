package headfirst.designpatterns.decorator.starbuzzcoffee.decorator;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
