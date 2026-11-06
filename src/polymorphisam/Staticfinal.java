package polymorphisam;



public class Staticfinal 
{
    int a=5;
	static String company="Luminar";
	final double pi =3.14;
	static final double pivalue =3.14;
	
	public static void main(String[] args) 
	{
		Staticfinal obj =new Staticfinal();
		System.out.println("value of a :" +obj.a);
		
		System.out.println("The value of  company :" +company ); //company is a static variable ,we can call it without the help of object
		company ="luminar Technolab";
		System.out.println("Updated value of a :" +company);
		
		System.out.println("value of pi :" +obj.pi);
		
		// obj.pi=4.15 ; final variable cannot be modified 
		
		System.out.println("value of pivalue :" +pivalue);// variable declared using 'static final 'keyword 
		

	}

}
