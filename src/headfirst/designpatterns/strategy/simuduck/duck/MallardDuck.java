package headfirst.designpatterns.strategy.simuduck.duck;

import headfirst.designpatterns.strategy.simuduck.fly.FlyWithWings;
import headfirst.designpatterns.strategy.simuduck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }
}
