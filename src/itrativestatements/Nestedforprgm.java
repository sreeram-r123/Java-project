package itrativestatements;

public class Nestedforprgm {

	public static void main(String[] args) {
		
		// ****
		// ****
		// **** 
		// 3 number of rows
		// 4 number of columns
		// 3x4 matrix
		
		for(int i=1 ; i<=3 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				System.out.print("*");
			}//return back to inner loop j++
			// return only when the condition of inner loop becomes false 
			System.out.println();
		}//retun back to outer loop i++

	}

}
