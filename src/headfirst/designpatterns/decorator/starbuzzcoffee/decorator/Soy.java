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
        double cost = beverage.cost();
        Size size = beverage.getSize();

        if (size == Size.TALL) {
            cost += .15;
        } else if (size == Size.GRANDE) {
            cost += .20;
        } else if (size == Size.VENTI) {
            cost += .25;
        }

        return cost;
    }
}
