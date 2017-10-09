package com.dlv.patterns.creational.builder;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order firstOrder = 	new Order.Builder()
				.withDrink("coke")
				.withSandwith("footlong sub")
				.withCondoments("mayo")
				.build();
		
		System.out.println(firstOrder.getSide());
				
	}

}
