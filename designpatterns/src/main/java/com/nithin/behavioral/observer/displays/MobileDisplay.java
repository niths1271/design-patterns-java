package com.nithin.behavioral.observer.displays;

import com.nithin.behavioral.observer.Subject;

public class MobileDisplay implements Observer {
    int tempToDisplay;
    Subject sub;

    public MobileDisplay(Subject s){
        sub=s;
        sub.add(this);
    }

    @Override
    public void display() {
       System.out.println("Current Temp for Mobile Display is: "+tempToDisplay);
    }

    @Override
    public void update(int temp) {
        tempToDisplay=temp;
    }
}
