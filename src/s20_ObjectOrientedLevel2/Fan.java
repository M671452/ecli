package s20_ObjectOrientedLevel2;

public class Fan {

	// State
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; // 0 - 5

	// Creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;

	}

	// isOn
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void swtchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	// Speed

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// Print of state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
		/*
		 * INSTED OF THIS: return "make - " + make + "radius - " + radius + " color - "
		 * + color + isOn + speed;
		 */
	}

}
