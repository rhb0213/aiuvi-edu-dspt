package com.aiuvi.edu.dspt.cttp.fctrsmpl;


/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public class FactoryAmd {
	
	public ICPUAmd createCPUI3() {
		return new CPUAmdI3();
	}
	
	public ICPUAmd createCPUI5() {
		return new CPUAmdI5();
	}
	
}
