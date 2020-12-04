package superKeyWord;

public class Car extends Vehicle{
	
	boolean hasSunroof;
	int noOfDoors;
	String bodyType;
	
	public void drift() {
		System.out.println("Drifiting");
	}

	public void selfDrive() {
		System.out.println("Selfparking");
	}
	
	public void printVehicleClassBody(){
		System.out.println(bodyType);
	}
	public void printCarClassBody(){
		System.out.println(this.bodyType);
	}
	
	public String getInfo(){
		return "[hasSunroof=" + hasSunroof + ", noOfDoors=" + noOfDoors + ", bodyType=" + bodyType + "]"+
	super.getInfo();
	}
	
}
