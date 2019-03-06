package com.aiuvi.edu.dspt.cttp.fctrabst;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 18:47
 */
public class ClientMain {
	
	public static void main(String args[]) {
		
		IFactory iFactory = new FactoryAmd();
		ICPUI3 icpui3 = iFactory.createCPUI3();
		ICPUI5 icpui5 = iFactory.createCPUI5();
		ICPUI7 icpui7 = iFactory.createCPUI7();
		
		icpui3.create();
		icpui5.create();
		icpui7.create();
		icpui7.create();
	}
}
