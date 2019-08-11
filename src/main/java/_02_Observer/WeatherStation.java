package _02_Observer;

/**
 * @author lwx
 * @date 2019/8/11-12:11
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay1 = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(1,2,3);
        currentConditionsDisplay.unObserve();
        weatherData.setMeasurement(2,3,4);
    }
}
