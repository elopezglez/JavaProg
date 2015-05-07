
public class Activity2 {

	   public static void main(String[] args) {
		   //E1();
		   E3();
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

	   
	   public static void E3() {
		  long time = new java.util.Date().getTime();
		   
		   // command-line argument
	        long n = Long.parseLong("999999999999999989");
	        System.out.print("The prime factorization of " + n + " is: ");

	        // for each potential factor i
	        for (long i = 2; i*i <= n; i++) {

	            // if i is a factor of N, repeatedly divide it out
	            while (n % i == 0) {
	                System.out.print(i + " "); 
	                n = n / i;
	            }
	        }

	        // if biggest factor occurs only once, n > 1
	        if (n > 1) System.out.println(n);
	        else       System.out.println();
		   
	        time =  (new java.util.Date().getTime()) - time;
	        System.out.println("it took: " + time + " miliseconds");
	        
	   }

	   
	
}
