package s20_Abstract;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanUp();
	
	
	

}
