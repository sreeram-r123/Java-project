package polymorphisam;

class Parent {

	public void qualification() {
		System.out.println("BCA");
	}
}

class child extends Parent {
//right click -> source -> override or implement method
	@Override
	public void qualification() {

		System.out.println("B-TECH");
	    super.qualification();//calling immediate parent class method 
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		child obj=new child();
		obj.qualification();		
		
		//Parent obj1=new Parent();
		//obj1.qualification();		
	}

}
