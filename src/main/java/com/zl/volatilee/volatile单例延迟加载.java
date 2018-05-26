package com.zl.volatilee;

public class volatile单例延迟加载 {
	private volatile static volatile单例延迟加载 instance = null;  
	 private volatile单例延迟加载() {}  
	 public static volatile单例延迟加载 getInstance() {  
	  if (instance == null) {  
	   synchronized (Singleton.class) {// 1  
	    if (instance == null) {// 2  
	     instance = new volatile单例延迟加载();// 3  
	    }  
	   }  
	  }  
	  return instance;  
	 }  

}
