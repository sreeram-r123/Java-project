package stringpackage;

public class Reverseprgm {

	public static void main(String[] args) {
		// 2. i/p  String s="Testing Training Center"
		  // o/p  Center Training Testing - Reverse the given sentence
		
		String s = "Testing Training Center";

        String [] w = s.split(" ");

        for (int i = w.length - 1; i >= 0; i--) 
        {
            System.out.print(w[i] + " ");
        }


	}

}
