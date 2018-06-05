package com.zl.Designpattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	 
	Map<String, Prototype>  ht= new HashMap<String,Prototype>();
     public PrototypeManager()
     {
    	
//         ht.put("A", new ConcretePrototypeA());
//         ht.put("B", new ConcretePrototypeB());
     }

     public void Add(String key, Prototype prototype)
     {
         ht.put(key, prototype);
     }

     public Prototype Get(String key)
     {
         Prototype clone = null;
         clone = ((Prototype)ht.get(key)).Clone();
         return clone;
     }
	

}
