package com.aiuvi.edu.dspt.cttp.abstfctr;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public class FactoryIntel implements IFactory{
	
	public ICPUI7 createCPUI7() {
		return new CPUI7Intel();
	}
	
	public ISSD240G createSSD240() {
		return new SSD240GIntel();
	}
	
	public ISSD480G createSSD480() {
		return new SSD480GIntel();
	}
}
