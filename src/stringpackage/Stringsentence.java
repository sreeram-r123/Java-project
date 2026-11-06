package stringpackage;

public class Stringsentence 
{

	public static void main(String[] args) 
	{
		// 4. String sentence = "Java is simple and easy to learn"; 
		   //Count the number of words in the sentence.
		
		        String s = "How are you";
		        String[] w = s.split(" ");
		        System.out.println("Number of words: " + w.length);     

		        for (String re:w) 
		        {
		        	
		            System.out.println(re);
		        }    
		        int index =w.length-1;
		        String rev="  ";
		        for (int i = index; i >= 0; i--) 
		        {
		        	//System.out.println(w[i]+" ");
		             rev = rev + w[i] +" ";
		        }
		        System.out.println(" ");
		        System.out.print("Reversed sentence is : ");
		        System.out.print(rev + "  ");
		       
		        }   
		    
	}

