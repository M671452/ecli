package s20_Abstract;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the microwave");

	}

	@Override
	void cleanUp() {
		System.out.println("Clean up the utensils");
		System.out.println("Switch off the microwave");

	}

}
