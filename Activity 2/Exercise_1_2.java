
public class Exercise_1_2 {
	
	   public static void main(String[] args) {
		/*   	Exercise_3();
		   	Exercise_4();
		   	Exercise_6();
		   	Exercise_7();
		   	Exercise_8();
		   	Exercise_9();
		   	Exercise_10();		   	
		   	Exercise_11();
		   	Section_1_3_3();

		   	Section_1_3_6();
		   	
		   	Section_1_3_8();
		   	
		   	Section_1_3_web_11();
		*/
		   	Section_1_3_web_15();
	   }
	   
	   
	   public static void Exercise_3 () {
		   boolean a,b,c;
		   a=true;
		   b=true;
		   c=true;		   
		   System.out.print(  (!(a && b) && (a || b)) || ((a && b) || !(a || b)) );
	   }
	   
	   public static void Exercise_4 () {
		   boolean a,b,c;
		   a=false;
		   b=false;
		   c=false;		   
		   System.out.print(a^b^c);
	   }
	   
	   public static void Exercise_6 () {
		   double a=10 ,b=3;
		   System.out.println();
		   System.out.println(10/3);
		   System.out.println(a/b);
	   }
	   
	   public static void Exercise_7 () {		   
	   	System.out.println(2 + "bc"); 
	   	System.out.println(2 + 3 + "bc"); 
	   	System.out.println((2+3) + "bc"); 
	   	System.out.println("bc" + (2+3));
	   	System.out.println("bc" + 2 + 3);
	   }
	   
	   public static void Exercise_8 () {		   
		   double sqroot =  Math.sqrt(5);
		   System.out.println(sqroot);
	   }
	   
	   public static void Exercise_9 () 
	   {
		   		System.out.println();
		   		System.out.println("EX ------------- 9");
	    	 	System.out.println('b');
	    	 	System.out.println('b' + 'c');
	    	 	System.out.println((char) ('a' + 4));	    	 
	    	 	System.out.println((char)4);  
	   }
	   
	   	   public static void Exercise_10 () 
	   {
		   		System.out.println();
		   		System.out.println("EX ------------- 10");

	   		int a = Integer.MAX_VALUE; // 2147483647; 
	   		System.out.println(a);
	   		System.out.println(a + 1);
	   		System.out.println(2 - a);
	   		System.out.println(-2 - a);
	   		System.out.println((long)2 * a);
	   		System.out.println((long) (4 * a));
	   }
	   
	      	   public static void Exercise_11 () 
	   {
	      		double a = 3.14159;
	      		System.out.println(a);
	      		System.out.println(a + 1);
	      		System.out.println(8 / (int) a);
	      		System.out.println(8 / a);
	      		System.out.println((int) (8 / a));

	   }
	   
	      	   public static void Section_1_3_3 () 
	   {
	      		   
	      		 int a=1,b=2,c=3;
	      		   
	      		if (a > b)
	      		  	c = 0;

	      		if (a > b) { c = 0; }
	      		if (a > b) c = 0;
	     		
	      		if (a > b) c = 0; else b = 0;



	   }
	      	   
      public static void Section_1_3_6 () 
	   {
    	  int i=0,j=0;
    	  /*
    	   * for (i = 0, j = 0; i < 10; i++) 
    		  j += i;
    	  for (i = 0, j = 1; i < 10; i++)
    		  j += j;
    	  
    	  for (j = 0; j < 10; j++) 
    		  j += j;
    	  */
    	  
    	  for (i = 0, j = 0; i < 10; i++) 
    		  j += j++;
    	  
    	  System.out.println(j + "  " + i);
	   }
      
      public static void Section_1_3_8 ()
      {
    	    // print integers from 1000 to 2000, 5 per line
          int start = 1000, end = 2000;
          for (int i = start; i <= end; i++) {
             System.out.print(i + " ");
             if (i % 5 == 4) System.out.println();
          }
          System.out.println();    	  
      }
      
      public static void Section_1_3_web_11 ()
      {     
	      double x = -32.2;
	      boolean isPositive = (x > 0);
	      if (isPositive = true) 
	    	  System.out.println(x + " is positive");
	      else
	    	  System.out.println(x + " is not positive");     
      }
            
      public static void Section_1_3_web_15()
      {
    		     int N = Integer.parseInt("10");
    		     int x = 1;
    		     while (N >= 1) {
    		        System.out.println(x);
    		        x = 2 * x;
    		        N = N / 2;
    		     }
   	 }
      
      
      

}
