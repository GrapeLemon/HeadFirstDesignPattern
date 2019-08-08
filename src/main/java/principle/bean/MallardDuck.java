package principle.bean;

import principle.behavior.FlyWithWings;
import principle.behavior.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("green head!");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
