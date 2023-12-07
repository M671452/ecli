package s20_Interface;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Goes in a hole");
	}

	@Override
	public void left() {
		System.out.println("Stop");

	}

	@Override
	public void right() {
		System.out.println("Go forward");
	}

}
