package headfirst.designpatterns.decorator.starbuzzcoffee.component;

public class DarkRoast extends Beverage {

    @Override
    public String description() {
        return "다크 로스트";
    }

    @Override
    public double cost() {
        return .99;
    }
}
