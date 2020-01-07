package springtest.javaconfig.beans;


public class ChickenSandwich implements Sandwich {
	
	private Layer layer1, layer2, layer3;
	
	public ChickenSandwich( Layer lettuce, Layer chicken, Layer tomato) {
		layer1=lettuce;
		layer2 = chicken;
		layer3 = tomato;	
	}
	
	public String getName() {
		return layer1.getName()+" "+layer2.getName()+" "+layer3.getName();
	}
	
	

}
