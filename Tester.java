package superKeyWord;

public class Tester {
	
	public static void main(String [] args) {
	
	Car c = new Car();
	
	c.bodyType = "sedan";
	
	c.printCarClassBody();
	c.printVehicleClassBody();
	System.out.println(c.getInfo());
	//System.out.println(super.getInfo());//super its not inhariting from Vehicle
	///we can't use super and this in static method
	
	}
}
