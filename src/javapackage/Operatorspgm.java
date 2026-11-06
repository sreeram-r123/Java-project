package javapackage;

public class Operatorspgm {

	public static void main(String[] args) {
		System.out.println("Arithametic Operators");
		
		int a=5;
		int b=3;
	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // a/b = 1 ,quotient
		System.out.println(a%b); // 5%3 =2 ,remainder
		
		System.out.println();
		System.out.println("Assignment Operators");
		// a=b; ,the value of b will be stored to a
		System.out.println(a+=b); // a = a+b; a = 5+3= 8 ,the updated value of a equal to 8 
		System.out.println(a-=b);//  a = a-b; a = 8-3 =5 , the updated value of a equal to 5 ; 
		
		System.out.println();
		System.out.println("Relational Operators");
		
		System.out.println("the vaule of a " + a );
		System.out.println("the vaule of b " + b );
		System.out.println(a==b); // false , the result will be in boolean 
		System.out.println(a>b); // true 5>3;
		System.out.println(a<b);// false 5<3;
		System.out.println(a>=b);//true 5>= 3;
		System.out.println(a<=b);// false 5<=3;
		System.out.println(a!=b);// true 5!=3;
		
		System.out.println();
		System.out.println("Logical Operators");
        String userName ="abc";
        String password ="1234";
        // AND(&&)- verify whether both condition are true 
        System.out.println(userName == "xyz" && password =="789");// abc == xyz && 1234==789 , condition one and two is faalse  hence the result will be false 
        System.out.println(userName == "abc" && password =="1234"); // abc == abc && 1234==1234 , condition one and two is true  hence the result will be true
        
        System.out.println();
        System.out.println("Result of OR operator"); // returns true when either one of the condition is true
        System.out.println(userName == "abc" || password =="123456");
        System.out.println(userName == "abweerc" || password =="123456");
        
        System.out.println();
        System.out.println("Result of NOT operator"); // 
        System.out.println(!(userName == "ugayas" )); // abc!=ugayas result =true
        
        System.out.println();
        System.out.println("Unary operator");// ++ value will be increamented by one -- value will be decreamented by one 
        //post increament / decrement  i++,i-- the value will be updated after printing
        int i= 1;
        
        System.out.println("post inceament");
        System.out.println("value of i = "+i);
        System.out.println("the value of i ="+(i++));//the value of i is updated after this line 
        System.out.println("the updated value of i ="+i);
        
        
        //pre increament/decreament  ++i,--i;
        System.out.println();
        System.out.println("pre inceament");
        System.out.println("value of i = "+i);
        // System.out.println("value of i after ++i = " + (++i));
        
        System.out.println(++i);
                    
          
	}

}
