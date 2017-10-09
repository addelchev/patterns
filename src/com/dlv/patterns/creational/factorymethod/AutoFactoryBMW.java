package com.dlv.patterns.creational.factorymethod;

import java.util.LinkedList;

public class AutoFactoryBMW extends AutoFactory{

	@Override
	public LinkedList<Auto> getSupportedAutos() {
		LinkedList<Auto> cars = new LinkedList();
		cars.add(new BMW());
		cars.add(new BMWhybrid());
		return cars;
	}

}
