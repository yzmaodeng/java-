package com.zl.Designpattern.Prototype;

import java.io.Serializable;

import com.zl.se.clone.DeepProfessor;
import com.zl.se.clone.SerializableClone;

public class ConcretePrototypeA extends Prototype implements Cloneable,Serializable {
	
	private String a="a";
	 private DeepProfessor professor;

	public DeepProfessor getProfessor() {
		return professor;
	}

	public void setProfessor(DeepProfessor deepProfessor) {
		this.professor = deepProfessor;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public Prototype Clone() {
        
            return SerializableClone.clone(this);
        
	}

	@Override
	public String toString() {
		return "ConcretePrototypeA [a=" + a + ", professor=" + professor + "]";
	}


}
