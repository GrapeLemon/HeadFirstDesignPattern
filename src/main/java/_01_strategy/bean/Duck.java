package _01_strategy.bean;

import _01_strategy.behavior.FlyBehavior;
import _01_strategy.behavior.QuackBehavior;

public abstract  class Duck {
    FlyBehavior flyBehavior;        //不加权限修饰符的话，默认是包可见的 也就是必须要在一个包下面才行
    QuackBehavior quackBehavior;
    public abstract void display();

    //其实加了这个的话就不用 Dcuk.FlyBehavior.fly() 这么鬼畜了 确实减少了代码量
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
