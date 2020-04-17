package main;

import abstractComputerFactory.AbstractFactoryPc;

public class Main {
	
	public static void main(String[] args) {
		AbstractFactoryPc af = new AbstractFactoryPc();
		af.createPc("ASUS","G-526",1, 1);
	}

}
