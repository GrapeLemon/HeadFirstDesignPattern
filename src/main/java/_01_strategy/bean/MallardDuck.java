package _01_Strategy.bean;

import _01_Strategy.behavior.FlyWithWings;
import _01_Strategy.behavior.Quack;

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
