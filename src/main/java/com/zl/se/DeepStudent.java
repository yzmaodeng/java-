package com.zl.se;

public class DeepStudent  implements Cloneable{
private String name;
    
    private int age;
    
    private DeepProfessor professor;

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

    public DeepProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(DeepProfessor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", professor="
                + professor + "]";
    }
    
    public Object clone() throws CloneNotSupportedException{
    	DeepStudent newStudent = (DeepStudent) super.clone();
        newStudent.professor = (DeepProfessor) professor.clone();
        return newStudent;
    }

}


