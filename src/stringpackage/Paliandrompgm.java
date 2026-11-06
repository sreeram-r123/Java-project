package stringpackage;

import java.util.Scanner;

public class Paliandrompgm 
{

	public static void main(String[] args) 
	{
		//1. Check whether given string is palindrome or not
		//   i/p Malayalam  o/p Given Word is Palindrome
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		
		int len=s.length()-1;
		
		String r=" ";
		String temp=s;
		
		for (int i=len;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("The word is"+r);
		
		if(temp.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
