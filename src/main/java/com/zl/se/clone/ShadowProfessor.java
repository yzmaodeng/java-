package com.zl.se.clone;

public class ShadowProfessor {
	
	 private String name;

	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "ShadowProfessor [name=" + name + ", age=" + age + "]";
	    }

}
