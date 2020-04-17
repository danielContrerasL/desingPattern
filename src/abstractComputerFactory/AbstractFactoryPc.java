package abstractComputerFactory;

public class AbstractFactoryPc {

	public static final int LAPTOP_TIPE = 1;
	public static final int DESKTOP_TIPE = 2;
	public static final int THIRTHY_TWO_TIPE = 1;
	public static final int SIXTY_FOUR_TIPE = 2;

	public AbstracFactory createPc(String brand, String reference, int pcType, int bts) {
		if (bts == THIRTHY_TWO_TIPE) {
			return new ConcretFactory32Bts(brand, reference, pcType);
		} else {
			return new ConcretFactory64Bts(brand, reference, pcType);
		}
	}

}
