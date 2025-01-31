package com.nithin.behavioral.observer.displays;

import com.nithin.behavioral.observer.Subject;

public class CarDisplay implements Observer {
    int tempToDisplay;
    Subject sub;

    public CarDisplay(Subject s){
        sub=s;
        sub.add(this);
    }

    @Override
    public void display() {
       System.out.println("Current Temp for Car Display is: "+tempToDisplay);
    }

    @Override
    public void update(int temp) {
        tempToDisplay=temp;
    }
}
