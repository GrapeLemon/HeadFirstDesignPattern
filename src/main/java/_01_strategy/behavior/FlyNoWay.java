package _01_Strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("i can't fly");
    }
}
