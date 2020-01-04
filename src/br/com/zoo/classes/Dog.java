package br.com.zoo.classes;

public class Dog extends Animal {

	public Dog(String name) {
		super(name, "Dog");
	}

	@Override
	public void speak() {
		System.out.println("Woof woof!");		
	}
}
