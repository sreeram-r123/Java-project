package stringpackage;

import java.util.Scanner;

public class Stringprograms 
{

	public static void main(String[] args) 
	{
		//3. i/p  String s="Good morning everyone"
		  // Check whether the word "morning" is present or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		String s1 =sc.nextLine();
		System.out.println(s1.contains("morning"));

		//4. String sentence = "Java is simple and easy to learn"; 
		  // Count the number of words in the sentence.
		
		String res = "Java is simple and easy to learn";		
		String ar[]= res.split(" ");
		for (String c:ar)
		{
			System.out.println(c);
		}
		
		System.out.println("The number of words" +ar.length);
		
	}

}
