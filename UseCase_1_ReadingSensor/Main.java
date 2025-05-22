package ReadingSensor.ReadingSensor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        localSensor local1=new localSensor(new Date()    ,  2.2 , "LocalSensor01 ", "SensorType:IN01" ,   "RegionID:INDIA1111");
        localSensor local2=new localSensor(new Date()   , 2.3 , "LocalSensor02 ", "SensorType:DE01" ,   "RegionID:DE01112");
        local1.getSensor();
        local2.getSensor();

        geospacialSensor Geo1=new geospacialSensor(new Date(),  1.2 ,   "GeospacialSensor01 ",   "SensorType:IN01",   "RegionID:IND1111");
        geospacialSensor Geo2=new geospacialSensor(new Date(), 4.4 ,   "GeospacialSensor02 ",   "SensorType:DE01",   "RegionID:DE01112");
        Geo1.getSensor();
        Geo2.getSensor();
        System.out.println("Sensor Data should be Displayed");
        System.out.println("Read all Sensor Data");
    }
}