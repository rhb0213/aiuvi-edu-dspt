package com.aiuvi.edu.dspt.cttp.abstfctr;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public interface IFactory {
	
	ICPUI7 createCPUI7();
	
	ISSD240G createSSD240();
	
	ISSD480G createSSD480();
	
}
