package com.dlv.patterns.creational.factorymethod;

import java.util.UUID;

public class Merzedes extends Auto {

	public Merzedes() {
		id = UUID.randomUUID().toString();
	}
	

	@Override
	public void turnOn() {
		System.out.println("The stuttgart fury is on");

	}

	@Override
	public void turnOff() {
		System.out.println("The stuttgart fury is off");

	}

	@Override
	public void printSerial() {
		System.out.println("Merzedes ID : " + id);

	}

}
