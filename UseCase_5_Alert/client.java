package com.climate.Alert;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to Alert Message use case scenario
 */
public class client {

    public static void main(String[] args) {
        System.out.println("************Observer Implementation**********");
        String alertMessage = "Sea Level exceeded limit!!!";
        ConcreteSubject subject = new ConcreteSubject(alertMessage);
        ObserverOne observerOne = new ObserverOne(subject);
        ObserverTwo observerTwo = new ObserverTwo(subject);
        Alert alert = new Alert();
        alert.addObserver(observerOne);
        alert.addObserver(observerTwo);
        alert.setAlertMessage(alertMessage);
    }
}
