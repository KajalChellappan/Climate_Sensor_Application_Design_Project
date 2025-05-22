package com.climate.Alert;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/*
* @Author Kajal Chellappan (12204385)
* This program is related to Alert Message use case scenario
*/
@Getter
@Setter
public class Alert {

    public String alertMessage;
    private ArrayList<Observer> observerList;
    public Alert() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
      observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
       observerList.remove(observerList.indexOf(observer));
    }

    public void notifyObserver() {
        for (Iterator<Observer> it =
             observerList.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.getAlert();
        }
    }
    void setAlertMessage(String message){
        this.alertMessage = message;
        notifyObserver();
    }
}
