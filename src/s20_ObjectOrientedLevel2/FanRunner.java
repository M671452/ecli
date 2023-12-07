package s20_ObjectOrientedLevel2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "BLUE");

		fan.switchOn();

		System.out.println(fan);

		fan.setSpeed((byte) 3);

		System.out.println(fan);

		fan.swtchOff();

		System.out.println(fan);

	}

}
