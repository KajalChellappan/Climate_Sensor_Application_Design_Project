package ReadingSensor.ReadingSensor;

import java.util.Date;

public class geospacialSensor implements SensorData{

    private Date Date;
    private double Value;
    private String Sensor_ID;
    private String Region_ID;
    private String SensorType;

    public  geospacialSensor(Date Date, double Value, String Sensor_ID, String Region_ID, String SensorType ){
        this.Date=Date;
        this.Value=Value;
        this.Sensor_ID=Sensor_ID;
        this.Region_ID=Region_ID;
        this.SensorType=SensorType;
    }
    @Override
    public void getSensor() {
        System.out.println(Date+""+Value+""+Sensor_ID+""+Region_ID+""+SensorType);
    }
    public void addSensors() {
        System.out.println("Add New Sensors");
    }
}

