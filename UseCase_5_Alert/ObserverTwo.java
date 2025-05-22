package com.climate.Alert;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to Alert Message use case scenario
 */
public class ObserverTwo extends Observer{

    protected ConcreteSubject subject;
    String alertMessage;

    public ObserverTwo(ConcreteSubject subject) {
        this.subject = subject;
        System.out.println("New observerTwo created!!!");
        subject.addObserver(this);
    }

    @Override
    public void getAlert() {
        this.alertMessage = subject.getAlertMessage();
        System.out.println("Alert observer Two : "+alertMessage);
    }
}
