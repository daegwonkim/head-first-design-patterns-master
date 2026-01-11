package headfirst.designpatterns.observer.weatherstationpull.observer;

import headfirst.designpatterns.observer.weatherstationpull.subject.WeatherData;

public class StatisticsDisplay implements Observer, Display {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();

        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
