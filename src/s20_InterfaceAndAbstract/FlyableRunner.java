package s20_InterfaceAndAbstract;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("With Wings");

	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With Fuel");

	}

}

public class FlyableRunner {

	public static void main(String[] args) {
		// ArrayList loop
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}

	}

}
