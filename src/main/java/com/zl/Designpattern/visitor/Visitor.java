package com.zl.Designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
interface Animal {

    void accept(Person person);
}
class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}

class Cat implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵！！！");
    }
}


class Home {
    private List<Animal> nodeList = new ArrayList<>();

    void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }


    void add(Animal animal) {
        nodeList.add(animal);
    }
}
class Owner implements Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}

class Someone implements Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
public class Visitor {

	public static void main(String[] args) 
	{
		 Home home = new Home();
	        home.add(new Dog());
	        home.add(new Cat());

	        Owner owner = new Owner();
	        home.action(owner);

	        Someone someone = new Someone();
	        home.action(someone);

	}

}
