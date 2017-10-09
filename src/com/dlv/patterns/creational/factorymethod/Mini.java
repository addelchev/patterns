package com.dlv.patterns.creational.factorymethod;

import java.util.UUID;

public class Mini extends Auto {

	public Mini() {
		id = UUID.randomUUID().toString();
	}
	

	@Override
	public void turnOn() {
		System.out.println("The mini starts up");
		
	}

	@Override
	public void turnOff() {
		System.out.println("The mini shuts down");

	}

	@Override
	public void printSerial() {
		System.out.println("Mini ID : " + id);
		
	}


	@Override
	public void assembleAuto() {
		System.out.println("=========================");
		System.out.println("The mini assembled pew pew");
		printSerial();
		turnOn();
		turnOff();
		System.out.println("=========================");
		
	}

}
