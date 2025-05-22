package dashboard.dashboard;

public class ChartBuilderClass implements ChartBuilder {
    public  static  ChartProduct chart;

    @Override
    public ChartProduct buildChart(){
        System.out.println("building a graph");
        return getResult();
    }
    public ChartProduct getResult(){
        ChartProduct chartProduct = new ChartProduct();
        chartProduct.getChart();
        return chartProduct;

    }
}