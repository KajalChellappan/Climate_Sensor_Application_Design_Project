package com.climate.ConfigManagement;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */
@Setter
public class Originator {
    public List<configuration> configs = new ArrayList<>();

    public Originator() {;
    }

    Memento saveToMemento(){
        System.out.println("Saving to Memento");
        return new Memento(configs);
    }


    void restore(Memento memento){
        this.configs = memento.getConfigs();
        System.out.println("config list with "+configs.size()+" elements restored from Memento: " + configs);

    }

}
