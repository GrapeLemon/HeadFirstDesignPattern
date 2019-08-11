package _02_Observer;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lwx
 * @date 2019/8/11-11:55
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    private List<Subject> subjectList;          //维护一个主题列表 有序可重复
    private Map<Type,Subject> subjectMap;     //维护一个主题列表，K-V形式
    private Set<Subject> subjectSet;            //维护一个主题集合，不可重复，无序

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //这种写法还是相当常见的 构造自己的同时把自己的引用交给别的对象使用，构成一个has-a的关系
        //其实如果是在这样写的话，就相当于是将默认情况设置为观察状态
        //其实这里又有一个问题了，如果我想关注多个主题呢？
        weatherData.registerObserver(this);
    }
    //这样写的意思就是把你想要订阅的主题的名字当参数传进来，这样的话你就可以订阅所有你传进来的名字
    //可以搞个枚举什么的来规范一下，这样就不会让用户乱写了额
    public CurrentConditionsDisplay(String... names) {
        for (String name : names){
            subjectMap.get(name).registerObserver(this);
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
    }

    public void unObserve(){
        weatherData.removeObserver(this);
    }
}

 enum Type{
    SPORT,MUSIC;
}