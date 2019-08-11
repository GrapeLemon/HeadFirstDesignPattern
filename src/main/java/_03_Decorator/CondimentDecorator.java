package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-13:53
 *
 *  Condiment是配料的意思
 *  从研究java的流体系可以看出，装饰者都会保留被装饰抽象类的引用
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
