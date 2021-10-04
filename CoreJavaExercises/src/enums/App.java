package enums;

public class App {

	public static void main(String[] args) {
		Animal animal = Animal.DOG;
		
		switch(animal) {
		case CAT:
			System.out.println("Theseus");
			break;
		case DOG:
			System.out.println("Rover");
			break;
		case MOUSE:
			System.out.println("Danger");
			break;
		default:
			System.out.println("None of the above");
			break;}
		
		System.out.println(Animal.CAT); // returns CAT
		System.out.println(Animal.CAT.getClass()); // returns class enums.Animal
		System.out.println(Animal.CAT instanceof Enum); // returns TRUE
	}
	

}
