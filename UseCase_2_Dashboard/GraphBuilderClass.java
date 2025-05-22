package dashboard.dashboard;

public class GraphBuilderClass implements GraphBuilder{
 public  static  GraphProduct graph;

 @Override
 public  GraphProduct buildGraph(){
  System.out.println("building a graph");
  return getResult();
 }
 public GraphProduct getResult(){
  GraphProduct graphProduct = new GraphProduct();
  graphProduct.getGraph();
  return graphProduct;

 }
}

