package com.aiuvi.edu.dspt.cttp.abstfctr;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public class FactoryAmd implements IFactory {
	
	public ICPUI7 createCPUI7() {
		return new CPUI7Amd();
	}
	
	public ISSD240G createSSD240() {
		return new SSD240GAmd();
	}
	
	public ISSD480G createSSD480() {
		return new SSD480GAmd();
	}
}
