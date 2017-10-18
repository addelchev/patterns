package com.dlv.patterns.creational.factorymethod;

public class FactoryTest {
	
	public static void main(String[] args) {

		AutoDealership munich = createAutoDealership(DealershipTypes.Munich);
		AutoDealership stuttgart = createAutoDealership(DealershipTypes.Stuttgart);
		
		System.out.println("==============");
		munich.showCaseAutos();
		System.out.println("==============");
		stuttgart.showCaseAutos();
		
	}

	public static AutoDealership createAutoDealership(DealershipTypes type) {
		switch(type) {
		case Munich:
			return new MunichDealership();
		case Stuttgart:
			return new StuttgartDealership();
			
		default:
			return null;
			
		}
	}

}
