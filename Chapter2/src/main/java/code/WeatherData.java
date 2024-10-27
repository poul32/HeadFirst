package code;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure);
        }
    }

    public void setData(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
