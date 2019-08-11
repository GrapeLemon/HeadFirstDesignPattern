package _01_Strategy;

import _01_Strategy.bean.Duck;
import _01_Strategy.bean.MallardDuck;
import _01_Strategy.bean.ModelDuck;
import _01_Strategy.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
