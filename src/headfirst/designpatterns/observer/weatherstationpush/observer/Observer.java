package headfirst.designpatterns.observer.weatherstationpush.observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
