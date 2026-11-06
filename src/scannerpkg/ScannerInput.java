package scannerpkg;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the roll  number");
		int a= sc.nextInt();
		
		System.out.println("Enter Name");
		String n=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter address");
		String ad=sc.nextLine();
		
		System.out.println("Grade");
		char g=sc.next().charAt(0);
		
		System.out.println("height");
		double d=sc.nextDouble();
		
		System.out.println("Roll number: " +a);
		System.out.println("Name: " +n);
		System.out.println("Address: " +ad);
		System.out.println("Grade: " +g);
		System.out.println("Height: " +d);

	}

}
