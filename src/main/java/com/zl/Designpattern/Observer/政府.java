package com.zl.Designpattern.Observer;

import java.util.Observable;

public class 政府  extends Observable  {
	
	    private String 开发商;  
     
	    private String 炒房客;  
	      
	    private String 购房者;  
	      
	    public 政府(){};  
	      
	    public void 政策改变(){  
	        setChanged();  
	        notifyObservers();  
	    }  
	      

	      
	      
	    public String get开发商() {
			return 开发商;
		}

		public String get炒房客() {
			return 炒房客;
		}

		public String get购房者() {
			return 购房者;
		}

		// 天气发生变化  
	    public void set出政策(String 开发商, String 炒房客, String 购房者){  
	        this.开发商 = 开发商;  
	        this.炒房客 = 炒房客;  
	        this.购房者 = 购房者;  
	        政策改变();  
	    }  
	  

}
