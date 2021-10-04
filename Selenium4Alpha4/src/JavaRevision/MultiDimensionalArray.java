package JavaRevision;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{

		int a[][] = new int[3][3]; // rows & columns

		//initialise values into grid like this:
		//	2	4	5
		//	3	4	7	
		a[0][0]=12; // row 0 col 0
		a[0][1]=4; // row 0 col 1
		a[0][2]=5; // row 0 col 2
		a[1][0]=22; // row 1 col 0
		a[1][1]=4; // etc
		a[1][2]=14; // etc
		a[2][0]=13; // etc
		a[2][1]=6; // etc
		a[2][2]=9; // etc
		
		//print out array values in grid format shown above
		
		int minValue = a[0][0];
		int maxValue = a[0][0];
		
		int gridValue = 0;
		int column = 0;
		
		for(int i = 0; i<3; i++) // run this three times, rows
		{
			for(int j = 0; j<3; j++) // run this three times, ref row 0, then ref row 1 
			{
				gridValue = a[i][j];
				System.out.print(gridValue);
				System.out.print("\t");
				if(gridValue < minValue) {
					minValue = gridValue;
					column = j;
				}
				if(gridValue > maxValue) {
					maxValue = gridValue;
				}
								
		    }
			System.out.println();
		}
						 
		System.out.println("Minimum value in the above matrix is: " + minValue + " from column " + (column+1));
		
		int maxValinCol = 0;
		for(int k = 0; k<3; k++) {
			if(a[k][column]>maxValinCol)
				maxValinCol = a[k][column];
		} 
			
		System.out.println("And the maximum value in column "+ (column+1) + " is: " + maxValinCol);
		System.out.println("-------------------\n");
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		/*
		for(int i = 0; i<3; i++) // run this three times, 
		{
			for(int j = 0; j<3; j++) // run this three times, ref row 0, then ref row 1 
			{
				System.out.print(b[i][j]);
				System.out.print("\t");
		    }
			System.out.println();
		}
		*/
		
		
		
		
	}
}
