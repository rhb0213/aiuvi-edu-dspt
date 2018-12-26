package com.aiuvi.edu.dspt.cttp.fctrmthd;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 18:47
 */
public class ClientMain {
	
	public static void main(String args[]) {
		
		IFactory iFactory = new FactoryIntel();
		ICPU icpui3 = iFactory.createCPUI3();
		
		icpui3.show();
	}
}
