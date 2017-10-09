package com.dlv.patterns.creational.factorymethod;

import java.util.UUID;

public class BMW extends Auto {
	
	public BMW() {
		id = UUID.randomUUID().toString();
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The bavarian beast roars with power");
	}


	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The bmw reluctantly turns off...");
	}

	public void printSerial() {
		System.out.println(id);
	}


	@Override
	public void assembleAuto() {
		System.out.println("=========================");
		System.out.println("The BMW assembled and ready to go");
		printSerial();
		turnOn();
		turnOff();
		System.out.println("=========================");
		
	}
}
