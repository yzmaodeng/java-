package com.zl.se.clone;

public class ShadowStudent implements Cloneable {
	      private String name;
  
  private int age;
  
  private ShadowProfessor shadowProfessor;

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

  public ShadowProfessor getProfessor() {
      return shadowProfessor;
  }

  public void setProfessor(ShadowProfessor shadowProfessor) {
      this.shadowProfessor = shadowProfessor;
  }

  @Override
  public String toString() {
      return "shadowStudent [name=" + name + ", age=" + age + ", shadowProfessor="
              + shadowProfessor + "]";
  }
  
  public Object clone() throws CloneNotSupportedException{
      return super.clone();
  }

}
