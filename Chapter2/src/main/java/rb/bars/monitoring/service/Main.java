package rb.bars.monitoring.service;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentStateDisplay = new CurrentStateDisplay(weatherData);
        weatherData.setData(123, 654);
    }
}