package ReadingSensor.ReadingSensor;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements SensorData{
    private List<SensorData> Sensor=new ArrayList<>();
    @Override
    public void getSensor() {
        for (SensorData Date : Sensor) {
            Date.getSensor();

        }
    }
}
