package com.zl.Designpattern.Prototype;

import com.zl.se.clone.DeepProfessor;

public class test {

	public static void main(String[] args) {

		PrototypeManager prototypeManager = new PrototypeManager();
		DeepProfessor deepProfessor = new DeepProfessor();
		deepProfessor.setAge(10);
		deepProfessor.setName("王方明");
		ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
		concretePrototypeA.setProfessor(deepProfessor);
		prototypeManager.Add("A", concretePrototypeA);
		//未克隆
		System.out.println(concretePrototypeA);
		
		
		ConcretePrototypeA cloneA = (ConcretePrototypeA)prototypeManager.Get("A");
		DeepProfessor deepProfessor2 = new DeepProfessor();
		deepProfessor2.setAge(20);
		deepProfessor2.setName("周冉");
		cloneA.setProfessor(deepProfessor2);
		
		
		System.out.println(concretePrototypeA);
		System.out.println(cloneA);
		System.out.println(concretePrototypeA==cloneA);
		
		
		
	}

}
