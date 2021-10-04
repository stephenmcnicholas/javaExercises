package innerClasses;

public class Robot {
	//class variable
	private int id;
	
	//non static inner class, aka Nested class, and where you need class to have access to the class variables of the outer class
	class Brain{
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	// static inner class NB: you can't use the class variable ID in this static class without making the variable itself static
	// used where you want to just group some classes with another (outer) class
	static class Battery{
		public void charge(){
			System.out.println("Battery charging...");
			// usually use static inner classes as a way of grouping 
		}
	}
	
	//constructor
	public Robot(int id) {
		this.id = id;
	}
	
	//method
	public void start() {
		
		System.out.println("Starting robot: " + id);
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		// can also create classes within methods
		class Temp{ 
			public void doSomething() {
				System.out.println("ID is " + id);
				System.out.println("My name is " + name); // use of variables if the variable is FINAL 
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
	
	
	
}
