package headfirst.designpatterns.decorator.starbuzzcoffee.component;

public class Decaf extends Beverage {

    @Override
    public String description() {
        return "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
