package gettersetter;

public class Laptop {
	
	String brand;
	String processorType;
	String Colour;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", processorType=" + processorType + ", Colour=" + Colour + "]";
	}
	
	

}
