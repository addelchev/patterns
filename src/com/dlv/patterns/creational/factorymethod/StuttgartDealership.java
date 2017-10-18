package com.dlv.patterns.creational.factorymethod;

import java.util.LinkedList;

public class StuttgartDealership extends AutoDealership {

	@Override
	public LinkedList<Auto> getAvailableCars() {
		LinkedList<Auto> cars = new LinkedList();
		cars.add(new Audi());
		cars.add(new Merzedes());
		return cars;
	}

}
