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
        double cost = beverage.cost();
        Size size = beverage.getSize();

        if (size == Size.TALL) {
            cost += .10;
        } else if (size == Size.GRANDE) {
            cost += .15;
        } else if (size == Size.VENTI) {
            cost += .20;
        }

        return cost;
    }
}
