package com.climate.ConfigManagement;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */

@Getter
@Setter
public class configuration {
    public String configName="";
    public String sensorID="";
    public String regionID="";
    public List<Sensor> sensors = new ArrayList<>();

}
