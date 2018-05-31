package com.zl.Type;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

interface  A{
	
}

  interface  B {
	
}


public class MyTypeVariable<K extends A & B, V> {

	public static void main(String[] args) {
		Type[] types = MyTypeVariable.class.getTypeParameters();
        for(Type type : types){
            TypeVariable t = (TypeVariable)type;
            System.out.println(t.getGenericDeclaration());
            int size = t.getBounds().length;
            System.out.println(t.getBounds()[size - 1]);
            System.out.println(t.getName() + "\n-------------分割线-------------");
        }
		

	}

}
