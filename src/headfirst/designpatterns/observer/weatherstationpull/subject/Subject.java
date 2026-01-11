package headfirst.designpatterns.observer.weatherstationpull.subject;

import headfirst.designpatterns.observer.weatherstationpull.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
