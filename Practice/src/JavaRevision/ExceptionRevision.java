package JavaRevision;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class ExceptionRevision 
{
	
	
	public void setValue(int value) {
		int c = value;
	}
	
	public static void main(String[] args) 
	{
		int a=4;
		
		int b = 3;
		int c = 0;
		int e = 2;
		int arr[] = new int[5];
		
		try 
		{
			System.out.println(arr[3]);
			int d = b/e;
			System.out.println(d);
			ExceptionRevision er = new ExceptionRevision();
			System.out.println(er.toString());
			
						
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("Arithmetic Exception: Cannot divide by zero");
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Index Out of Bounds: Array has a length of " + arr.length);
		}
		catch(Exception ex)
		{
			System.out.println("General Exception found");
		}
		finally {
			System.out.println("Final statements are executed, regardless of exceptions caught");
		}
		
		
	}
}
