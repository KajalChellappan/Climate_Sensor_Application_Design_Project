package com.climate.Alert;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to Alert Message use case scenario
 */
public class ObserverOne extends Observer{
    private ConcreteSubject subject;
    String alertMessage;

    public ObserverOne(ConcreteSubject subject) {
        this.subject = subject;
        System.out.println("New observerOne created!!!");
        subject.addObserver(this);
    }

    @Override
    public void getAlert() {
        this.alertMessage = subject.getAlertMessage();
        System.out.println("Alert observer One : "+alertMessage);
    }
}
