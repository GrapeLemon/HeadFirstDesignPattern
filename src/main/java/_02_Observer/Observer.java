package _02_Observer;

/**
 * @author lwx
 * @date 2019/8/11-11:27
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
