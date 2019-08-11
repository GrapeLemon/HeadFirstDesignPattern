package _01_Strategy.bean;

import _01_Strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
