package abstractComputerFactory;

public class ConcretFactory32Bts extends AbstracFactory{
	
	private String brand;
	private String reference;
	
	public ConcretFactory32Bts(String brand, String reference, int pcType) {
		this.brand = brand;
		this.reference = reference;
		if (pcType == AbstractFactoryPc.DESKTOP_TIPE) {
			createProductDesktop();
		}else {
			createProductLaptop();
		}
	}

	@Override
	public AbstracProductDesktop createProductDesktop() {
		return new AbstracProductDesktop(reference, brand, "Escritorio" , 32);
	}

	@Override
	public AbstracProductLaptop createProductLaptop() {
		return new AbstracProductLaptop(reference, brand, "Portatil" , 32);
	}

}
