package com.zl.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;  




public class 测试ConcurrentMap是线程安全的 {
	  private static Map<String, Long> mapWordCounts = new HashMap<>();  
	    private static ConcurrentMap<String, Long> concurrentMapWordCounts = new ConcurrentHashMap<>();  
	    public static Logger logger = Logger.getLogger(测试ConcurrentMap是线程安全的.class);   
	    public static int count=0;  
	      
	    public static long mapIncrease(String word) {  
	        Long oldValue = mapWordCounts.get(word);  
	        Long newValue = (oldValue == null) ? 1L : oldValue + 1;  
	        mapWordCounts.put(word, newValue);  
	        return newValue;  
	    }  
	      
	       
	    public static long ConcurrentMapIncrease(String word) {  
	        Long oldValue, newValue;  
	        while (true) {  
	            oldValue = concurrentMapWordCounts.get(word);  
	            if (oldValue == null) {  
	                newValue = 1L;  
	                if (concurrentMapWordCounts.putIfAbsent(word, newValue) == null) {  
	                    break;  
	                }  
	            } else {  
	                newValue = oldValue + 1;  
	                if (concurrentMapWordCounts.replace(word, oldValue, newValue)) {  
	                    break;  
	                }  
	            }  
	        }  
	        return newValue;  
	    }  
	      
	    public static void mapWordCount() throws InterruptedException, ExecutionException {  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.mapIncrease("work"));
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.mapIncrease("work"));  
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.mapIncrease("work"));  
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.mapIncrease("work"));  
	            }  
	        }).start();  
	    }                 
	          
	    public static void concurrentWordCount() throws InterruptedException, ExecutionException {  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.ConcurrentMapIncrease("work"));  
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.ConcurrentMapIncrease("work"));  
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.ConcurrentMapIncrease("work"));  
	            }  
	        }).start();  
	        new Thread(new Runnable(){    
	            public void run() {  
	                int count=0;  
	                while(count++<10000)   
	                    System.out.println("mapIncrease num is " + 测试ConcurrentMap是线程安全的.ConcurrentMapIncrease("work"));  
	            }  
	        }).start();  
	    }    
	    
	  
	    public static void main(String[] args) throws InterruptedException, ExecutionException {  
//	        CountWorkNum.mapWordCount();  
//	        Thread.sleep(10000);  
//	        System.out.println("final count map"+CountWorkNum.mapWordCounts.get("work")); 
	        测试ConcurrentMap是线程安全的.concurrentWordCount();  
	        Thread.sleep(10000);  
	        System.out.println("final count concurrentMap"+测试ConcurrentMap是线程安全的.concurrentMapWordCounts.get("work"));
	    }  


}
