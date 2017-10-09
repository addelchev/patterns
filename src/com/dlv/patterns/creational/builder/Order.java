package com.dlv.patterns.creational.builder;

public class Order {
	
	private final String drink;
	private final String sandwitch;
	private final String condoments;
	private final String side;
	
	private Order(Order.Builder builder) {
		drink = builder.drink;
		sandwitch = builder.sandwitch;
		condoments = builder.condoments;
		side = builder.side;		
	}
	
	public String getDrink() {
		return drink;
	}


	public String getSandwitch() {
		return sandwitch;
	}


	public String getCondoments() {
		return condoments;
	}


	public String getSide() {
		return side;
	}


	public static class Builder{
		
		private String drink;
		private String sandwitch;
		private String condoments;
		private String side;
		
		public Builder withDrink(String s) {
			this.drink = s;
			return this;
		}
		
		public Builder withSandwith(String s) {
			this.sandwitch = s;
			return this;
		}
		
		public Builder withCondoments(String s) {
			this.condoments = s;
			return this;
		}
		
		public Builder withSide(String s) {
			this.side = s;
			return this;
		}
		
		public Order build() {
			return new Order(this);
		}
		
	}

}
