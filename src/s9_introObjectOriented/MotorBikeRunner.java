package s9_introObjectOriented;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// class object = new intance of class
		MotorBike ducati = new MotorBike(100);
		// class object = new intance of class
		MotorBike honda = new MotorBike(200);
		
		MotorBike somethingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());


		// object.method();
		ducati.start();
		honda.start();
	
		// ducati.setSpeed(100);
		// honda.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());



	}
}