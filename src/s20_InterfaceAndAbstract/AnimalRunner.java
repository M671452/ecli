package s20_InterfaceAndAbstract;

//Inheritance and abstract and polymorphism

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunner {
	public static void main(String[] args) {

		// ArrayList and Polymorphism
		Animal[] animals = { new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.bark();
		}

	}

}
