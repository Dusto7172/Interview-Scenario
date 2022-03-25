package gettersetter;

public class TestLaptop {
	
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setBrand("Dell");
		lap.setProcessorType("Intel Core i5");
		lap.setColour("Grey");
		System.out.println("LAPTOP: " +"Brand- " +lap.getBrand()+",ProcessorType- "+lap.getProcessorType()+",Colour- "+lap.getColour()+".");
		System.out.println(lap);
		
	}
	


}
