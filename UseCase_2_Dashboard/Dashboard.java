package dashboard.dashboard;

import java.util.Date;


public class Dashboard {
 public String ConfigName;
    public String RegionID;
    public Date DateFrom;
    public Date DateTo;


    public void getSensorData() {
       System.out.println("Read sensor data for the config1");

    }
    public void showGraphData() {
       System.out.println("showing graph data");
       GraphBuilder graphBuilder = new GraphBuilderClass();
       graphBuilder.buildGraph();
       System.out.println(graphBuilder.buildGraph());
    }

    public void showMapData() {
       System.out.println("showing Map data");
       MapBuilder mapBuilder = new MapBuilderClass();
       System.out.println(mapBuilder.buildMap());
    }

    public void showChartData() {
       System.out.println("showing Chart data");
       ChartBuilder chartBuilder = new ChartBuilderClass();
       System.out.println(chartBuilder.buildChart());
    }
}


