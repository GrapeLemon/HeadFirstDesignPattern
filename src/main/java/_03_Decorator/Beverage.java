package _03_Decorator;

/**
 * @author lwx
 * @date 2019/8/11-13:51
 *
 *  Beverage 是 饮料的意思
 *  神奇的是,无论是装饰者还是被装饰者都继承了该类
 *  只是被装饰者是直接继承
 *  装饰者是间接继承（装饰者继承了顶层类的子类 假设顶层是0 被装饰者在1 装饰者在2）
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
