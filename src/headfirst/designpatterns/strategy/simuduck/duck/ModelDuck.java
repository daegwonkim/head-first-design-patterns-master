package headfirst.designpatterns.strategy.simuduck.duck;

import headfirst.designpatterns.strategy.simuduck.fly.FlyNoWay;
import headfirst.designpatterns.strategy.simuduck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
