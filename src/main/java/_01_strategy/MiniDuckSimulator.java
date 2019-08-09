package _01_strategy;

import _01_strategy.bean.Duck;
import _01_strategy.bean.MallardDuck;
import _01_strategy.bean.ModelDuck;
import _01_strategy.behavior.FlyRocketPowered;

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
