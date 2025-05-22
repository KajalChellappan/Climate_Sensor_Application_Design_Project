package com.climate.Alert;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to Alert Message use case scenario
 */
public class ConcreteSubject extends Subject{

    private List<Observer> observers = new ArrayList<Observer>();
    private String alertMessage;
    public ConcreteSubject(String alertMessage) {
        this.alertMessage = alertMessage;
    }
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.getAlert();
        }
    }

    String getAlertMessage(){
        return this.alertMessage;
    }


}
