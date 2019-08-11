package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-19:05
 */
public class Milk extends CondimentDecorator{
    private static int count = 0;
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .60 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,milk" + (count++);
    }
}
