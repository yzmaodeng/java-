package com.zl.collection;

public class Map的线程安全实现 {
	
/*	1. 使用synchronized词进行自己包装

	2. 使用concurrent包下的lock锁自己包装

	3. 使用concurrent包下的读写锁

	4. 使用conllections.synchronizedMap()方式获取线程安全的map

	5. 使用concurrent包中的concurrentHashMap

	1、使用synchronized 关键字，代码如下

	synchronized(anObject){

	　　value =map.get(key);

	}

	 

	2、使用 JDK1.5提供的锁（java.util.concurrent.locks.Lock）。代码如下

	lock.lock();

	value =map.get(key);

	lock.unlock();

	 

	3、使用 JDK1.5 提供的读写锁（java.util.concurrent.locks.ReadWriteLock）。代码如下

	rwlock.readLock().lock();

	value =map.get(key);

	rwlock.readLock().unlock();

	这样两个读操作可以同时进行，理论上效率会比方法 2 高。 

	4与5：

	Map<String, Object> map2 = Collections.synchronizedMap(newTreeMap<String, Object>());

	Map<String, Object> map3 = new ConcurrentHashMap<String,Object>();

	Collections.synchronizedMap()和Hashtable一样，实现上在调用map所有方法时，都对整个map进行同步，而ConcurrentHashMap的实现却更加精细，它对map中的所有桶加了锁。所以，只要要有一个线程访问map，其他线程就无法进入map，而如果一个线程在访问ConcurrentHashMap某个桶时，其他线程，仍然可以对map执行某些操作。这样，ConcurrentHashMap在性能以及安全性方面，明显比Collections.synchronizedMap()更加有优势。同时，同步操作精确控制到桶，所以，即使在遍历map时，其他线程试图对map进行数据修改，也不会抛出ConcurrentModificationException。

	ConcurrentHashMap从类的命名就能看出，它必然是个HashMap。而Collections.synchronizedMap()可以接收任意Map实例，实现Map的同步。*/


	
	
	

}
