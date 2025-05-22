package com.climate.ConfigManagement;

import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */
public class Memento {
    private List<configuration> configs;

    public Memento(List<configuration> configs){
        this.configs = configs;
    }

    public List<configuration> getConfigs(){
        return configs;
    }
}
