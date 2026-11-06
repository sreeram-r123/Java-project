package polymorphisam;

public class Overloading {

	public void add(int a ,int b) {
		System.out.println("Method 1 ="+(a+b));
	}
	
	public void add(int a ,int b,int c) {
		System.out.println("Method 2 ="+(a+b+c));
	}
	
	public void add(int a ,double b) {
		System.out.println("Method 3 ="+(a+b));
	}
	
	public void add(double a ,int b) {
		System.out.println("Method 4 ="+(a+b));
	}
	
			
	public static void main(String[] args) 
	{
		Overloading obj=new Overloading();
		obj.add(2,5,7);// method 2
		obj.add(6, 02);//method 1
		obj.add(1.2, 6);//method 4
		obj.add(2,4.5);//method 3
		

	}

}
