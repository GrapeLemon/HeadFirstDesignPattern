package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-13:54
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
