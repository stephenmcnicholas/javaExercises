package innerClasses;

public class App {

	public static void main(String[] args) {
		Robot robot = new Robot(7);
		robot.start();
		
		// you can explicitly call an inner class outside of the public class, but this is not v common
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
	}

}
