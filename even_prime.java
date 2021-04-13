package AP;  // this is showing that i have created a file in Ap soucre in Eclipse 

public class even_prime {
	public static void main(String[] args) {
		 int number=10000 ;		
		 for (int i = 1; i < number; i++) {
	            if(number==10000) {
	            //System.out.println(System.nanoTime()-start);
	            }
	            
   }
//Thread for even count
      Runnable runnable1=()->{  
      	 
      	int evenCount = 0;
			for(int i = 1; i < number; i++)
  		{
  			if(i % 2 == 0)
  			{
  				//System.out.print(i +" ");
  				evenCount++;
  			}
  		}		
  		System.out.println("Total Number of Even Numbers = " + evenCount);  // Ans= 4999
  	};
	 
     // Thread for prime count
      
     
      Runnable runnable2=()->{ 
   	   int flag;
   	   int primeCount = 0;

          for (int i = 1; i <= number; i++) {
   
       	   // to check whether it is divisible by 1 and its self 
              if (i == 1 || i == 0)
                  continue;

              // number not prime check
              flag = 1;
   
              for (int j = 2; j <= i / 2; ++j) {
                  if (i % j == 0) {
                      flag = 0;
                      break;
                  }
              }
   
             // Number is prime 
              if (flag == 1)
           	   primeCount++;
          }
          System.out.println("Total Number of Prime Numbers = " + primeCount); // Ans= 1229
      };

      new Thread(runnable1).start();
      new Thread(runnable2).start();
  }   
}
