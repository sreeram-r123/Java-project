package scannerpkg;

public class Variabletypes 
{

	int a;//instance variable 
	int b=5;// instance variable
	static int c=10;//static variable
	
	public void display() 
	{
		System.out.println("The value of a =" +a);
		System.out.println("The value of b =" +b);
		System.out.println("The value of c =" +c);
		
		int x =15; //local variable
		System.out.println("The value of x =" +x);
	}
	
			
	public static void main(String[] args) 
	{
		Variabletypes obj = new Variabletypes();//object declaration
		obj.a=2;// Assigning values to instance variable
		obj.display();// calling method using object
		
		System.out.println("The value of instance variable =" +obj.b);//calling instance variable using object
		
		System.out.println("The value of  static variable =" +c);//calling satic varibles without using object
		//System.out.println(obj.x);// x is a local variable we cannot call it outside the table
	    
	}

}
