package com.dlv.patterns.creational.factorymethod;

import java.util.LinkedList;

public class MunichDealership extends AutoDealership{

	@Override
	public LinkedList<Auto> getAvailableCars() {
		LinkedList<Auto> cars = new LinkedList();
		cars.add(new BMW());
		cars.add(new BMWhybrid());
		cars.add(new Mini());
		return cars;
	}

}
