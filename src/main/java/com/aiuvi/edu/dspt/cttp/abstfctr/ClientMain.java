package com.aiuvi.edu.dspt.cttp.abstfctr;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 18:47
 */
public class ClientMain {
	
	public static void main(String args[]) {
		
		IFactory iFactory = new FactoryIntel();
		ICPUI7 icpui7 = iFactory.createCPUI7();
		ISSD240G issd240G = iFactory.createSSD240();
		ISSD480G issd480G = iFactory.createSSD480();
		
		icpui7.show();
		issd240G.show();
		issd480G.show();
	}
}
