package JavaRevision;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StaticVariables 
{
	private String name;
	private String address;
	static String city = "London";
	private int age;
		
	public StaticVariables(String name, String address, int age){
		
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address+ ", " + city;
	}

	public int getAge() {
		return age;
	}

	public void updateAddress(String newName){
				
	}
	
	public void birthday(int newAge){
		this.age = newAge;
		
	}
	
	
	
	public static void main(String[] args) 
	{
		StaticVariables obj = new StaticVariables("Stephen", "Franciscan Rd", 42);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		
		obj.updateAddress("Sussex Road");
		obj.birthday(43);
		System.out.println("Change of address recorded. New Address is: ");
		System.out.println(obj.getAddress());
		System.out.println("Happy birthday, you are now: ");
		System.out.println(obj.getAge());
	
		
		
		
	}
}
