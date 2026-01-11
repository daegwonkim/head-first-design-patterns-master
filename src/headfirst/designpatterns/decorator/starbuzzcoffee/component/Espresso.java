package headfirst.designpatterns.decorator.starbuzzcoffee.component;

public class Espresso extends Beverage {

    @Override
    public String description() {
        return "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
