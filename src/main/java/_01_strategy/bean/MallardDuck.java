package _01_strategy.bean;

import _01_strategy.behavior.FlyWithWings;
import _01_strategy.behavior.Quack;

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
