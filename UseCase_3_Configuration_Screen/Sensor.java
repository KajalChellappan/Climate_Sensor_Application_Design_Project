package com.climate.configuration;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration screen use case scenario
 */
@Getter
@Setter
public class Sensor {
    public String sensorID ;
    public String sensorType ;
    public String regionID ;
    public String readingValue ;
    public String readingDateTime ;
}
