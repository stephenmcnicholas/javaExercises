package JavaRevision;

public class LoopRevision 
{
	public static void main(String[] args) 
	{
		int count = 1;
		for(int i =1; i<4;i++) //outer loop runs 4 times
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(count*3 + "\s");
				count++;
			}
			System.out.println();
			
		}
		
		
	}
}
