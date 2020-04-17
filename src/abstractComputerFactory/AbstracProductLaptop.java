package abstractComputerFactory;

public class AbstracProductLaptop {
	
	private static int CONT_ID = 0;
	private int id;
	private String reference;
	private String brand;
	private String type;
	private int architect;
	
	public AbstracProductLaptop(String reference, String brand, String type, int architect) {
		id = CONT_ID++;
		this.reference = reference;
		this.brand = brand;
		this.architect = architect;
		this.type = type;
		System.out.println(getComputer());
	}
	
	public String getComputer() {
		return id + ", " + brand + " " + type + " " + reference + ", " + architect + " bits";
	}
	

}
