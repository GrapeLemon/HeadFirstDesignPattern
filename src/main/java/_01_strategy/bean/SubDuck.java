package _01_strategy.bean;

import _01_strategy.behavior.FlyWithWings;
import _01_strategy.behavior.Quack;

public class SubDuck extends  ModelDuck{
    public SubDuck() {
        flyBehavior = new FlyWithWings();   //这里相当于设置它的默认行为了
        quackBehavior = new Quack();
    }
}
