package _02_Observer;

/**
 * @author lwx
 * @date 2019/8/11-11:25
 *  在接口中，我们需要定义的是 "行为" 属性是另一套东西了相当于，应该放在具体的实现类里面
 *
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
