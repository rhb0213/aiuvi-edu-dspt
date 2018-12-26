package com.aiuvi.edu.dspt.cttp.fctrsmpl;


/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 18:47
 */
public class ClientMain {
	
	public static void main(String args[]) {
		
		FactoryAmd iFactory = new FactoryAmd();
		ICPUAmd icpuAmdI3 = iFactory.createCPUI3();
		ICPUAmd icpuAmdI5 = iFactory.createCPUI5();
		
		icpuAmdI3.show();
		icpuAmdI5.show();
	}
}
