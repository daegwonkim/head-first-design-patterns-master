package headfirst.designpatterns.decorator.starbuzzcoffee.decorator;

import headfirst.designpatterns.decorator.starbuzzcoffee.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String description();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
