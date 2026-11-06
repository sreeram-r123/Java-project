package methodspackage;

public class Methodstyps {

	public static void main(String[] args) {
		Methodstyps obj =new Methodstyps();
		int result =obj.add(2,5);//to store the result to  a variable
		System.out.println("Addition "+result);
		
		obj.sub();
		

	}
	//1.Methods with parameter and with return type
	public int add(int a,int b)
	{
		return a+b;//the value will be returned  to the main method
	}
	
	//2.Method without parameter and without return types
	int x=15 ,y=6;
	public void sub()
	{ 
		System.out.println("Subtraction:"+(x-y));
	}
	

}
