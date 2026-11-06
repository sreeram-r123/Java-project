package arraypkg;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		
		int sum =0;
		
		int ar[]=new int[3];
		for (int i=0; i<3 ; i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("The array values are : ");
		
		for(int v:ar)
		{
			System.out.print(v+" ");
		}
		for (int i=0; i<3 ; i++)
		{
			sum=sum+ar[i];
		}
		System.out.println();
		System.out.print("The sum i " +sum);

	}

}
