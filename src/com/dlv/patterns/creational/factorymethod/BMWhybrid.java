package com.dlv.patterns.creational.factorymethod;

import java.util.UUID;

public class BMWhybrid extends Auto {

	public BMWhybrid() {
		id = UUID.randomUUID().toString();
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The bavarian elecrtic machine quietly rumbles");
	}


	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("You don't even notice it's off");
	}

	public void printSerial() {
		System.out.println(id);
	}


	@Override
	public void assembleAuto() {
		System.out.println("=========================");
		System.out.println("The BMW hybrid assembled and ready to go");
		printSerial();
		turnOn();
		turnOff();
		System.out.println("=========================");
		
	}

}
