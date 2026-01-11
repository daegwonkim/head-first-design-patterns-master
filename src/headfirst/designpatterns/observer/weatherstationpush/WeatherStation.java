package headfirst.designpatterns.observer.weatherstationpush;

import headfirst.designpatterns.observer.weatherstationpush.observer.CurrentConditionDisplay;
import headfirst.designpatterns.observer.weatherstationpush.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weatherstationpush.observer.HeatindexDisplay;
import headfirst.designpatterns.observer.weatherstationpush.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weatherstationpush.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatindexDisplay heatindexDisplay = new HeatindexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
