package headfirst.designpatterns.strategy.simuduck;

import headfirst.designpatterns.strategy.simuduck.duck.Duck;
import headfirst.designpatterns.strategy.simuduck.duck.MallardDuck;
import headfirst.designpatterns.strategy.simuduck.duck.ModelDuck;
import headfirst.designpatterns.strategy.simuduck.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
