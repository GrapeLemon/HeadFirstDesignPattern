package _02_Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    //在具体的主题中存放具体的观察者列表
    private ArrayList<Observer> observers;
    //还要保存需要推送给观察者们的信息 下面的这些信息其实可以封装一下,不过也每什么必要了
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();  //一个具体主题带着自己的一个观察者列表 挺好的
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        /*
            书上的做法是先取下标再按照下表去掉,相当于遍历一次list
            我的做法是直接remove,看了 jdk的源代码之后发现它会做各种判断，所以这些写就行了
         */
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach((observer) -> observer.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObservers();  //逻辑就是当状态发生改变的时候,通知所有观察者
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
