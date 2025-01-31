package com.nithin.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import com.nithin.behavioral.observer.displays.Observer;

public class WeatherStation implements Subject {
    public List<Observer> observerList = new ArrayList<>();

    public int currentTemp = 20;

    @Override
    public void add(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("Notifying all the observers!!!!!");
        for(Observer o:observerList){
            o.update(currentTemp);
        }
    }

    @Override
    public void setData(int temp) {
        currentTemp=temp;
        notifyAllObserver();
    }

    @Override
    public void viewData() {
        System.out.println("Current Temp reported from the Weather Station is: "+currentTemp);
    }

}
