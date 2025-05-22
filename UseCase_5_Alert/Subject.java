package com.climate.Alert;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to Alert Message use case scenario
 */
public abstract class Subject {

    void addObserver(Observer observer){};
    void removeObserver(Observer observer){};
    void notifyObserver(){};
}
