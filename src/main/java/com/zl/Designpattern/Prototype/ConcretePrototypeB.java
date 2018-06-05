package com.zl.Designpattern.Prototype;

import java.io.Serializable;

import com.zl.se.clone.DeepProfessor;
import com.zl.se.clone.SerializableClone;

public class ConcretePrototypeB extends Prototype implements Cloneable,Serializable {
	
	private String b="B";
	 private DeepProfessor professor;

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConcretePrototypeB [b=" + b + ", professor=" + professor + "]";
	}

	public DeepProfessor getProfessor() {
		return professor;
	}

	public void setProfessor(DeepProfessor professor) {
		this.professor = professor;
	}

	@Override
	public Prototype Clone() {
        
            return SerializableClone.clone(this);
        
	}


}
