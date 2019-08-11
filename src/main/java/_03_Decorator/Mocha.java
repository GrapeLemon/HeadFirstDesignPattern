package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-14:08
 * 这里感觉确实是放抽象类会好一点，既可以带属性，方法又可以有实现
 * 所以说研究Java的流体系会发现底层设计用的是抽象类而不是接口，应该就是这个道理
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;  //抽象类

    //从这个构造方法可以看出 每一个装饰者都会依赖被装饰者
    //具体表现持有被装饰者的抽象类
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
