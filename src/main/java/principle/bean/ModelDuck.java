package principle.bean;

import principle.behavior.FlyWithWings;
import principle.behavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWings();   //这里相当于设置它的默认行为了
        quackBehavior = new Quack();
    }

    public void display() {

    }
}
