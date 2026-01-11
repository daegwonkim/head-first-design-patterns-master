package headfirst.designpatterns.decorator.starbuzzcoffee.component;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;

    public abstract String description();
    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
