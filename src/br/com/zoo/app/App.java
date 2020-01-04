package br.com.zoo.app;

import br.com.zoo.classes.Animal;
import br.com.zoo.classes.Dog;

public class App {

	public static void main(String[] args) {
		Animal dog = new Dog("Toto");
		
		dog.birthday();
		dog.birthday();
		dog.birthday();
		dog.speak();
		dog.birthday();
		dog.isAlive();
		dog.speak();
		dog.die();
		
		dog.birthday();
		dog.isAlive();
	}

}
