package com.dlv.patterns.creational.factorymethod;

public abstract class Auto {
	
	protected String id;
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
	public abstract void printSerial();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
