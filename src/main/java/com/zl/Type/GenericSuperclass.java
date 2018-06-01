package com.zl.Type;

public class GenericSuperclass {
	
	
	public static void main(String[] args) {
        System.out.println("Student.class.getSuperclass()\t" 
                            + Student.class.getSuperclass());
        System.out.println("Student.class.getGenericSuperclass()\t"
                            + Student.class.getGenericSuperclass());
        
        System.out.println("Test.class.getSuperclass()\t" 
                            + GenericSuperclass.class.getSuperclass());
        System.out.println("Test.class.getGenericSuperclass()\t"
                            + GenericSuperclass.class.getGenericSuperclass());
       
        System.out.println("Object.class.getGenericSuperclass()\t" 
                            + Object.class.getGenericSuperclass());
        System.out.println("Object.class.getSuperclass()\t" 
                            + Object.class.getSuperclass());
        
        System.out.println("void.class.getSuperclass()\t" 
                            + void.class.getSuperclass());
        System.out.println("void.class.getGenericSuperclass()\t" 
                            + void.class.getGenericSuperclass());
        
        System.out.println("int[].class.getSuperclass()\t" 
                            + int[].class.getSuperclass());
        System.out.println("int[].class.getGenericSuperclass()\t" 
                            + int[].class.getGenericSuperclass());
    }

}

class Person<T> {

}
interface Monkey<T> {

}

class Student extends Person<GenericSuperclass> implements Monkey<String>  {

}


