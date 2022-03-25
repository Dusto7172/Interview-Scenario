package gettersetter;

public class Car {
	
	String colour;
	String type;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		 
		Car c = new Car();
		c.setColour("MidNight Blue");
		c.setType("Suv");
		System.out.println(c.getColour()+"  "+c.getType());
	}

}
