package com.dlv.patterns.creational.factorymethod;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		System.out.println("======= Using reflection based factory =======");
		
	
		AutoFactory bmwCars = createAutoFactory(AutoTypes.BMW);
		
		bmwCars.showCaseAutos();
		
		
	}

	private static AutoFactory createAutoFactory(AutoTypes type) {
		switch(type) {
		case BMW:
			return new AutoFactoryBMW();
			
		default:
			return null;
			
		}
	}

}
