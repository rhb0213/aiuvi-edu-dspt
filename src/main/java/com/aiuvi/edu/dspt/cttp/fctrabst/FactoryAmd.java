package com.aiuvi.edu.dspt.cttp.fctrabst;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public class FactoryAmd implements IFactory {
	
	public ICPUI3 createCPUI3() {
		return new CPUI3Amd();
	}
	
	public ICPUI5 createCPUI5() {
		return new CPUI5Amd();
	}
	
	public ICPUI7 createCPUI7() {
		return new CPUI7Amd();
	}
	
}
