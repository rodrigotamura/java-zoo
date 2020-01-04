package br.com.zoo.classes;

public abstract class Animal {
	private String name;
	private int age;
	private Boolean alive;
	private String kind;
	
	public Animal(String name, String kind) {
		this.alive = true;
		this.age = 0;
		this.name = name;
		
		System.out.println("Hello " + this.name + "!");
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
		
	public String isAlive() {
		String phraseAlive;
		
		if(this.alive) {
			phraseAlive = "Yes, " + this.name + "is alive!";
		}else {
			phraseAlive = "Nope, " + this.name + "is dead :(";
		}
		return phraseAlive;
	}
	
	public void birthday() {
		if(this.alive) {
			this.age = this.age + 1;
			System.out.println("Happy birthday, " + this.name + "! Today you are " + this.age + " years old.");
		}else {
			System.out.println("Sorry, but " + this.name + " has passed away and it was " + this.age + " years old");
		}
		
	}
	
	public void die() {
		this.alive = false;
		System.out.println(this.name + " is dead!");
	}
	
	public abstract void speak();
}
