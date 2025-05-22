package com.climate.ConfigManagement;

import lombok.Getter;
import lombok.Setter;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */
@Getter
@Setter
public class Sensor {
    public String countryID ;
    public String regionID ;
    public String sensorType ;
    public String sensorID ;
    public String readingValue ;
    public String readingDateTime ;
}
