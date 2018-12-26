package com.aiuvi.edu.dspt.cttp.singleton;

/**
 * 懒汉 单例模式
 *
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-26 17:12
 */
public class SingletonLazy {
	
	private static SingletonLazy instance = null;
	
	private SingletonLazy() {
	}
	
	public static synchronized SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
