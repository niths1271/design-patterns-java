package com.nithin.behavioral.observer;

import com.nithin.behavioral.observer.displays.Observer;

public interface Subject {

    public void add(Observer o);
    public void remove(Observer o);
    public void notifyAllObserver();
    public void setData(int data);
    public void viewData();

}
