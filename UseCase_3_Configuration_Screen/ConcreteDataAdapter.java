package com.climate.configuration;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration screen use case scenario
 */
public class ConcreteDataAdapter implements SensorDataAdapter {
    @Autowired
    SensorData sensorData = new SensorData();

    public ConcreteDataAdapter() {
    }

    @Override
    public String getSensorData(){
        System.out.println("getSensorData invoked from adapter");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(sensorData.getSensorData());
        System.out.println("---------------------------------------------------------------------");
        String jsonData = convertToJson();
        System.out.println(jsonData);
        System.out.println("---------------------------------------------------------------------");
        return jsonData;
    }
    public String convertToJson(){
        return "Converted SensorData to JSON format from XML format";
    }
}
