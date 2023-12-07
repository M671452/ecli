package s20_Abstract;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dishes");

	}

	@Override
	void cleanUp() {
		System.out.println("Clean up the utensils");

	}

}
