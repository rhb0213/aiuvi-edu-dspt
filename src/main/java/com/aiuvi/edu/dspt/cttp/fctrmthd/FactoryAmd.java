package com.aiuvi.edu.dspt.cttp.fctrmthd;


/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public class FactoryAmd implements IFactory {
	
	public ICPU createCPUI3() {
		return new CPUI3Amd();
	}
	
}
