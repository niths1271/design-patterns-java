package com.nithin.behavioral.observer.displays;

import com.nithin.behavioral.observer.Subject;

public class TVDisplay implements Observer{
    int tempToDisplay;
    Subject sub;

    public TVDisplay(Subject s){
        sub=s;
        sub.add(this);
    }

    @Override
    public void display() {
       System.out.println("Current Temp for TV Display is: "+tempToDisplay);
    }

    @Override
    public void update(int temp) {
        tempToDisplay=temp;
    }

}
