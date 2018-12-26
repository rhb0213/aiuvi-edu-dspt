package com.aiuvi.edu.dspt.cttp.fctrabst;

/**
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-25 19:16
 */
public interface IFactory {
	
	ICPUI3 createCPUI3();
	
	ICPUI5 createCPUI5();
	
	ICPUI7 createCPUI7();
	
}
