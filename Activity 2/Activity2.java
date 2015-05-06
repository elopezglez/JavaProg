
public class Activity2 {

	   public static void main(String[] args) {
		   E1();
	   }
	   
	   public static void E1() {

		     // read in one command-line argument
	        long N = Long.parseLong("50");

	        int i = 0;                // count from 0 to N
	        long powerOfTwo = 1;       // the ith power of two

	        // repeat until i equals N
	        while (i <= N) {
	            System.out.println(i + " " + powerOfTwo);   // print out the power of two
	            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
	            i = i + 1;
	        }	  
	        
	   }

	   
	
}
