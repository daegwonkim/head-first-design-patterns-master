package headfirst.designpatterns.decorator.starbuzzcoffee.component;

public class HouseBlend extends Beverage {

    @Override
    public String description() {
        return "하우스 블렌드";
    }

    @Override
    public double cost() {
        return .89;
    }
}
