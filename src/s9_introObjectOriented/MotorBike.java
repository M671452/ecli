package s9_introObjectOriented;

public class MotorBike {

	// state
	// datatype instanceVariable;
	private int speed; // member variable and is 0 (defalut)

	MotorBike() { // This a a no-argument comstrructor.
		this(5);
	}

	// nameOfTheMethod(class Name)(parameters){
	MotorBike(int speed) { // constructor method, and dont need a returntype
		this.speed = speed;
	}

	// behaviour
	// method
	// inputs - int speed
	// outputs - vois
	// name - setSpeed

	/*
	 * TO GENERATE GETTERS AND SETTERS: right click -> source -> generate getters
	 * and setters
	 */
	public void setSpeed(int speed) { // local variable
		if (speed > 0) {
			this.speed = speed;
		}
	}


	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}


	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}



	/*
	 * returntype method(){ Action }
	 */
	void start() {
		System.out.println("Bike started");
	}

}
