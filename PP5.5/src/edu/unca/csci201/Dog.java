package edu.unca.csci201;

public class Dog {
    double age;
    String name;
    
    public Dog(double age, String name) {
	this.age = age;
	this.name = name;
    }

    public double getAge() {
        return age;
    }
    
    public double getDogAge() {
        return age * 7;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
	return "The dog " + name + ", is " + age + " years old.";
    }
    
    
}
