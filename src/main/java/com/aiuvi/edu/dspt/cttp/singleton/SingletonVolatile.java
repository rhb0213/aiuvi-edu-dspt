package com.aiuvi.edu.dspt.cttp.singleton;

/**
 * 饿汉 单例模式
 *
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-26 17:29
 */
public class SingletonVolatile {
	
	private volatile static SingletonVolatile instance = null;
	
	private SingletonVolatile() {
	}
	
	public static SingletonVolatile getInstance() {
		
		//先检查实例是否存在，如果不存在才进入下面的同步块
		if (instance == null) {
			//同步块，线程安全的创建实例
			synchronized (SingletonVolatile.class) {
				//再次检查实例是否存在，如果不存在才真正的创建实例
				if (instance == null) {
					instance = new SingletonVolatile();
				}
			}
		}
		return instance;
	}
}
