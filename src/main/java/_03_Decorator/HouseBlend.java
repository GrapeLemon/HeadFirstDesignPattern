package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-13:56
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
