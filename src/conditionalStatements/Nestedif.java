package conditionalStatements;

public class Nestedif {

	public static void main(String[] args) {
		int age =20,weight=50;
		
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("eligible for blood donation");//it will execute when conditions satisfy 
			}
			else
			{
				System.out.println("underweight");//executes when second  conditon is false
			}
		}
		else	
		{
			System.out.println("your age is not eligible");//execute when the 1 condition is false
		}

	}

}
