package com.dlv.patterns.creational.singleton;

public enum Singleton {
	INSTANCE;
	
	int data = 87;
	
	public int getData() {
		return data;
	}
}
