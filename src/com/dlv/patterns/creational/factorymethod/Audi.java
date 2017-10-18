package com.dlv.patterns.creational.factorymethod;

public class Audi extends Auto {

	public Audi() {
		
	}
	

	@Override
	public void turnOn() {
	System.out.println("The Inglostadt power is on");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audi slowly shuts down");
	}

	@Override
	public void printSerial() {
		// TODO Auto-generated method stub
		
	}


}
