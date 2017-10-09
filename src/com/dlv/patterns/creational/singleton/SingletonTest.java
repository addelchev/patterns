package com.dlv.patterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.INSTANCE;
		
		System.out.println(singleton.getData());
	}
}
