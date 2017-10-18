package com.dlv.patterns.creational.factorymethod;

import java.util.LinkedList;

// With this simple enum factory every time the user defines new instance of Auto changes to the factory need to be made
// this violates the OCP of SOLID
public abstract class AutoDealership {
	
	private LinkedList<Auto> supportedBrands;
	
	public void showCaseAutos() {

		LinkedList<Auto> supportedBrands = getAvailableCars();
		
		System.out.println("Available cars in " + this.getClass().getSimpleName());
		System.out.println("==============");
		for (Auto auto : supportedBrands) {
			System.out.println(auto.toString());
		}
		
	}

	public abstract LinkedList<Auto> getAvailableCars();
	
}
