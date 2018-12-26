package com.aiuvi.edu.dspt.cttp.singleton;

/**
 * 使用枚举实现 单例模式
 * <p>
 * 单元素的枚举类型已经成为实现Singleton的最佳方法。
 * 用枚举来实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可。
 *
 * @author ru.haibo
 * @version v1.0.0
 * @create 2018-12-26 17:16
 */
public enum SingletonEnum {
	
	/**
	 * 定义一个枚举的元素，它就代表了Singleton的一个实例。
	 */
	instance;
	
	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation() {
		//功能处理
	}
}
