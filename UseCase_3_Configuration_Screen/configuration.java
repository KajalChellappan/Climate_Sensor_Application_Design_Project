package com.climate.configuration;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration screen use case scenario
 */
@Getter
@Setter
public class configuration {
    public String configName;
    public String regionID;
    public List<Sensor> sensors = new ArrayList<>();
    ConcreteDataAdapter adapter = new ConcreteDataAdapter();

    public configuration() {
    }

    public configuration(String configName, String regionID) {
        this.configName = configName;
        this.regionID = regionID;
    }


    public void findSensors(String regionID){
        System.out.println("findSensors invoked");
        }

    public void getSensorData(){
        System.out.println("getSensorData invoked from configuration");
        String jsonData = adapter.getSensorData();
        System.out.println("Calling preview with the Json formatted sensor data");
        showPreview(jsonData);
       }
    public void showPreview(String jsonSensorData){
        System.out.println("Preview displayed with "+jsonSensorData);
        System.out.println("**********************************************************************");
    }

}
