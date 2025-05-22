package dashboard.dashboard;

public class MapBuilderClass implements MapBuilder {
  public  static  MapProduct map;
    public  MapProduct buildMap(){
        System.out.println("building a map");
        return getResult();
    }
    public MapProduct getResult(){
        MapProduct mapProduct = new MapProduct();
        mapProduct.getMap();
        return mapProduct;

    }


}
