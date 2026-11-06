package scannerpkg;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 
		System.out.println("enter the operation +,-,*,/");
		char n=sc.next().charAt(0);
		
		switch(n)
		{
		case '+' : System.out.println("sum is "+(a+b));
		break;
		
		case '-' : System.out.println("sum is "+(a+b));
		break;
		
		case '*' : System.out.println("sum is "+(a+b));
		break;
		
		case '/' : System.out.println("sum is "+(a+b));
		break;
		
		default : System.out.println("invalid choice");
		
		}
		 
		 

	}

}
