package _03_Decorator;

/**
 * @author lwx
 * @date 019/8/11-14:17
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        /**
         *  //我感觉因为要用"链式引用"才能理解这个玩意的深意
         *  beverage -> HouseBlend -> Mocha -> Milk -> Milk
         *  执行顺序是 后进先出 栈模式
         */
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
      //  beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + "  $" + beverage.cost());

        /**
         * 简化写法 最里面是第一层
         */
        Beverage beverage2 = new Milk(new Milk(new HouseBlend()));
        System.out.println(beverage2.getDescription() + "  $" + beverage2.cost());

    }
}
