package com.dlv.patterns.creational.factorymethod;

import java.util.UUID;

public class BMW extends Auto {
	
	public BMW() {
		id = UUID.randomUUID().toString();
	}
	
	@Override
	public void turnOn() {
		System.out.println("The bavarian beast roars with power");
	}

	@Override
	public void turnOff() {
		System.out.println("The bmw reluctantly turns off...");
	}

	public void printSerial() {
		System.out.println(id);
	}


}
