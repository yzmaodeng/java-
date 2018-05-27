package com.zl.volatilekey;

//https://www.cnblogs.com/dolphin0520/p/3920373.html
public class thread模拟指令重排 {

	private static boolean context = false;
	private static volatile  boolean context1 = false;
	private  static   boolean inited = false;

	public static void main(String[] args) {
		
		
		
		
		 new Thread(new Runnable(){    
	            public void run() { 
	            	
	            	while(!context) {
               System.out.println("222222");	            		
 
	            	}
	            	
	            	
	            	}
	            }
	               
	                
	        ).start();  
		 
		 

		 new Thread(new Runnable(){    
	            public void run() { 
	           
	            	context=true;
	            	
	            	}
	            }
	               
	                
	        ).start();  


		
		
		
		
		
	}

}
