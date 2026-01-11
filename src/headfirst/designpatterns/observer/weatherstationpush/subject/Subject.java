package headfirst.designpatterns.observer.weatherstationpush.subject;

import headfirst.designpatterns.observer.weatherstationpush.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
