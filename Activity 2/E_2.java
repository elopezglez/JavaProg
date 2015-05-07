 
public class E_2 { 

    public static void main(String[] args) {
    		/**
    		 * E_2();
    		 * E_4();
    		 * E_5_2();
    		 * E_6();
    		 */    		
    		
    		E_8();
    }
    

    public static void E_2() {
        int N = Integer.parseInt("5");
        StdDraw.setXscale(-N, +N);
        StdDraw.setYscale(-N, +N);
        StdDraw.clear(StdDraw.GRAY);

        int x = 0, y = 0;
        int steps = 0;
        while (Math.abs(x) < N && Math.abs(y) < N) {
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
            StdDraw.filledSquare(x, y, 0.45);
            double r = Math.random();
            if      (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;
            steps++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, .45);
            StdDraw.show(40);
        }
        System.out.println("Total steps = " + steps);
        
        /*
        StdDraw.square(.2, .8, .1);
        StdDraw.filledSquare(.8, .8, .2);
        StdDraw.circle(.8, .2, .2);
        */
    }

   public static void E_4() { 
      System.out.println("log N \tN \tN log N\tN^2 \tN^3");
      for (long i = 2; i <= 1073741824; i *= 2) {
         System.out.print((long) Math.log(i));
         System.out.print('\t');             // tab character
         System.out.print(i);
         System.out.print('\t');             
         System.out.print((long) (i * Math.log(i)));
         System.out.print('\t');             
         System.out.print(i * i);
         System.out.print('\t');             
         System.out.print(i * i * i);
         System.out.println();
      }
   }
   
   public static void E_5 ()
   {
	   int n = Integer.parseInt("5");

       // set v to the largest power of two that is <= n
       int v = 1;
       while (v <= n/2) {
           v = v * 2;
       }
 
       // check for presence of powers of 2 in n, from largest to smallest
       while (v > 0) {

           // v is not present in n 
           if (n < v) {
               System.out.print(0);
           }

           // v is present in n, so remove v from n
           else {
               System.out.print(1);
               n = n - v;
           }

           // next smallest power of 2
           v = v / 2;
       }

       System.out.println();
   }
   
   public static void E_5_2()
   {
	   int i = 256;
       while (i >= 0) {
           System.out.println(toHex(i) +'\t' + Integer.toHexString(i) +'\t' + Integer.toBinaryString(i));
           i--;
       }
 
   }
    

   public static String firstHex(int dec) {
       String numeroHex="";
       if(dec < 16) {
           switch(dec) {
                   case 10:
                   numeroHex="A";
                   break;
                   case 11:
                   numeroHex="B";
                   break;
                   case 12:
                   numeroHex="C";
                   break;
                   case 13:
                   numeroHex="D";
                   break;
                   case 14:
                   numeroHex="E";
                   break;
                   case 15:
                   numeroHex="F";
                   break;
                   default:
                   numeroHex=Integer.toString(dec);
                   break;
               }
           return numeroHex;
       } else {
       return "false";
       }
   }
   
   public static String toHex(int dec) {
	 	int cociente = 16, residuo = 0;
	 	String numeroHex = "", numeroHex1 = "";
	 	if (dec < 16) {
	 		numeroHex = firstHex(dec);
	 	} else {
	 		do {
	 			cociente = dec / 16;
	 			residuo = dec % 16;
	 			dec = cociente;
	 			numeroHex1 = firstHex(residuo);
	 			numeroHex = numeroHex1 + numeroHex;
	 			dec = cociente;
	 		} while (dec >= 16);
	 		numeroHex1 = firstHex(dec);
	 		numeroHex = numeroHex1 + numeroHex;
	 	}
	 	return numeroHex;
	 }         
   
   
   public enum Day {
	    
	   	SUNDAY(7){
	   		@Override
	   		public String toString() {
	   			// TODO Auto-generated method stub
	   			return "Sunday override";
	   		}
	   	}, MONDAY(1), TUESDAY(1), WEDNESDAY(3){
	   		@Override
	   		public String toString() {
	   			// TODO Auto-generated method stub
	   			return "WEDNESDAY override";
	   		}
	   	},
	    THURSDAY(4), FRIDAY(5), SATURDAY(6);
	    
	    private int numberValue;
	    
	    Day(int numberValue){
	    	this.numberValue = numberValue;
	   	}
	    	    
	    
	    public static Day getDayFromValue(int value){
	    	switch(value){
	    		case 1 : return Day.MONDAY;
	    		case 2 : return Day.TUESDAY;
	    		case 3 : return Day.WEDNESDAY;
	    		case 4 : return Day.THURSDAY;
	    		case 5 : return Day.FRIDAY;
	    		case 6 : return Day.SATURDAY;
	    		case 7 : return Day.SUNDAY;
	    	}
	    	return null;
	    }
	    
	}
   
	    public static void E_6() { 
	        int m = Integer.parseInt("04");
	        int d = Integer.parseInt("01");
	        int y = Integer.parseInt("2015");

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        System.out.println(Day.getDayFromValue(d0).toString());	   
	        
	        System.out.println(Day.SUNDAY.toString());	
	        
	    }

	    public static void E_8() { 
	        int D = Integer.parseInt("365");     // number of days
	        int people = 0;                        // total number of people

	        //  days[d] = true if someone born on day d; false otherwise
	        //  auto-initialized to false
	        boolean[] days = new boolean[D];

	        while (true) {
	            people++;
	            int d = (int) (D * Math.random());    // integer between 0 and D-1
	            if (days[d]) break;                   // two people with the same birthday, so break out of loop
	            days[d] = true;                       // update days[d]
	        }

	        System.out.println(people);
	    }	    
   
   
}
