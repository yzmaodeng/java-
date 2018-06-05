package com.zl.se;

public class test {

	public static void main(String[] args) {
		
		//引用类型发生变化
//		ShadowProfessor p1 = new ShadowProfessor();
//		p1.setName("Professor Zhang");
//		p1.setAge(30);
//
//		ShadowStudent s1 = new ShadowStudent();
//		s1.setName("xiao ming");
//		s1.setAge(18);
//		s1.setProfessor(p1);
//
//		System.out.println(s1);
//
//		try {
//			ShadowStudent s2 = (ShadowStudent) s1.clone();
//			ShadowProfessor p2 = s2.getProfessor();
//			p2.setName("Professor Li");
//			p2.setAge(45);
//			s2.setProfessor(p2);
//			System.out.println("复制后的：s1 = " + s1);
//			System.out.println("复制后的：s2 = " + s2);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
//		        shadowStudent [name=xiao ming, age=18, shadowProfessor=ShadowProfessor [name=Professor Zhang, age=30]]
//				复制后的：s1 = shadowStudent [name=xiao ming, age=18, shadowProfessor=ShadowProfessor [name=Professor Li, age=45]]
//				复制后的：s2 = shadowStudent [name=xiao ming, age=18, shadowProfessor=ShadowProfessor [name=Professor Li, age=45]]
	
		
		
		//基本类型不变
//		ShadowProfessor p1 = new ShadowProfessor();
//		p1.setName("Professor Zhang");
//		p1.setAge(30);
//
//		ShadowStudent s1 = new ShadowStudent();
//		s1.setName("xiao ming");
//		s1.setAge(18);
//		s1.setProfessor(p1);
//
//		System.out.println(s1);
//
//		try {
//			ShadowStudent s2 = (ShadowStudent) s1.clone();
//			ShadowProfessor p2 = s2.getProfessor();
//			 s2.setName("xiao hong");
//			 s2.setAge(17);
//			p2.setName("Professor Li");
//			p2.setAge(45);
//			s2.setProfessor(p2);
//			System.out.println("复制后的：s1 = " + s1);
//			System.out.println("复制后的：s2 = " + s2);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//shadowStudent [name=xiao ming, age=18, shadowProfessor=ShadowProfessor [name=Professor Zhang, age=30]]
//复制后的：s1 = shadowStudent [name=xiao ming, age=18, shadowProfessor=ShadowProfessor [name=Professor Li, age=45]]
//复制后的：s2 = shadowStudent [name=xiao hong, age=17, shadowProfessor=ShadowProfessor [name=Professor Li, age=45]]
//结论 :如果想要clone()得到的新对象的修改不会影响被复制的对象的字段时，我们就需要实现深复制（deep copy）

		
//		//深度clone
//		DeepProfessor p1 = new DeepProfessor();
//		p1.setName("Professor Zhang");
//		p1.setAge(30);
//
//		DeepStudent s1 = new DeepStudent();
//		s1.setName("xiao ming");
//		s1.setAge(18);
//		s1.setProfessor(p1);
//
//		System.out.println(s1);
//
//		try {
//			DeepStudent s2 = (DeepStudent) s1.clone();
//			DeepProfessor p2 = s2.getProfessor();
//			 s2.setName("xiao hong");
//			 s2.setAge(17);
//			p2.setName("Professor Li");
//			p2.setAge(45);
//			s2.setProfessor(p2);
//			System.out.println("复制后的：s1 = " + s1);
//			System.out.println("复制后的：s2 = " + s2);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
//		
//Student [name=xiao ming, age=18, professor=Professor [name=Professor Zhang, age=30]]
//复制后的：s1 = Student [name=xiao ming, age=18, professor=Professor [name=Professor Zhang, age=30]]
//复制后的：s2 = Student [name=xiao hong, age=17, professor=Professor [name=Professor Li, age=45]]
		
		
		
		
		
	}

}
