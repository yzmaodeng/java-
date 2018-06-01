package com.zl.Type.Demo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 持久层通用实现
 * 
 * @author zhaoqx
 * 
 */
public class BaseDaoImpl<T>  implements IBaseDao<T> {
	// 实体类型
	private Class<T> entityClass;



	/**
	 * 在构造方法中动态获得操作的实体类型
	 */
	public BaseDaoImpl() {
		// 获得父类（BaseDaoImpl<T>）类型
		ParameterizedType genericSuperclass = (ParameterizedType) this
				.getClass().getGenericSuperclass();
		// 获得父类上的泛型数组
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		entityClass = (Class<T>) actualTypeArguments[0];
	}


}
