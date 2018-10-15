package airborn;

public class AirPlane {
	int distance; //probeg
	private int fuel;     // bak
	byte seats;   // mesta
	
	public AirPlane(){
		
	}
	
	public AirPlane( int fuel, int seats){
		if ( fuel > 0 && seats > 0){
		this.distance = 0;
		this.fuel = fuel;
		this.seats = (byte)seats;
		} else {
			System.err.println("WRONG");
		}
	}
	
	public String toString(){
		return "\nPlane \nTANK: "       + this.fuel
					         + " Liters \nSEATS: " + this.seats 
					         + "\nDISTANCE "      + this.distance;
	}

}
