package com.dlv.patterns.creational.factorymethod;

import java.util.LinkedList;

// With this simple enum factory every time the user defines new instance of Auto changes to the factory need to be made
// this violates the OCP of SOLID
public abstract class AutoFactory {
	
	private LinkedList<Auto> supportedBrands;
	
	public void showCaseAutos() {

		LinkedList<Auto> supportedBrands = getSupportedAutos();
		
		for (Auto auto : supportedBrands) {
			auto.assembleAuto();
		}
		
	}

	public abstract LinkedList<Auto> getSupportedAutos();
	
}
