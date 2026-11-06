package stringpackage;

public class Stringmethods {

	public static void main(String[] args) {
		
		
       String s1 = "Hello World";
        
        // toUpperCase()
        System.out.println(s1.toUpperCase()); // Output: HELLO WORLD

        // toLowerCase()
        System.out.println(s1.toLowerCase()); // Output: hello world

        // length()
        System.out.println(s1.length()); // Output: 11

        // trim()
        String s5 = "   Hello   ";
        System.out.println("Before trim :" + s5);
        System.out.println("After trim :" + s5.trim()); // Output: Hello

        // startsWith and endsWith (case-sensitive)
        String s6 = "Hello everyone Good morning";
        System.out.println(s6.startsWith("Hello")); // Output: true
        System.out.println(s6.endsWith("morning"));  // Output: true
        
        //charAt(index position)
        System.out.println(s6.charAt(2));
        
        //substring(start index,end index)
        System.out.println(s6.substring(0, 12));
        
        //split()
        String [] result =s6.split(" ");
        System.out.println("The result after split is ");
        for (String v:result)
        {
        	System.out.println(v);
        }
                
        System.out.println("The number of words = "+result.length);// to find the length or no of words i a string
        
        //tocharArray()
        String s7 ="Sreeram";
        System.out.println("The result after char array");
        char [] ar = s7.toCharArray();
        for(char c:ar)
        {
        	System.out.println(c);
        }
        
        //replace();
        System.out.println(s6.replace("Hello","Hi"));
        
        
        
        }

}


