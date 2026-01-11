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
        double cost = beverage.cost();
        Size size = beverage.getSize();

        if (size == Size.TALL) {
            cost += .20;
        } else if (size == Size.GRANDE) {
            cost += .25;
        } else if (size == Size.VENTI) {
            cost += .30;
        }

        return cost;
    }
}
