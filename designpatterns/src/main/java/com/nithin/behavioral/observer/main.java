package com.nithin.behavioral.observer;

import com.nithin.behavioral.observer.displays.CarDisplay;
import com.nithin.behavioral.observer.displays.MobileDisplay;
import com.nithin.behavioral.observer.displays.Observer;
import com.nithin.behavioral.observer.displays.TVDisplay;

public class main {

    public static void main(String args[]){
        Subject s = new WeatherStation();
        s.viewData();
    
        //Registering all the displays to the Weather Station
        Observer o1 = new TVDisplay(s);
        Observer o2 = new MobileDisplay(s);
        Observer o3 = new CarDisplay(s);
    
        //Updating the temp of Weather Station which in turn notifies all the registered observers
        s.setData(35);
    
        // All the displays notified about it
        o1.display();
        o2.display();
        o3.display();
    }
}
