package Today27Feb;

public class PrimeNumber1to150 {	    
		   public static void main(String[] args) {
		      int i = 2;
		      boolean isPrime = true;

		      while (i <= 150) {
		         // Assume number is prime until proven otherwise
		         isPrime = true;

		         // Check if i is prime by iterating from 2 to i-1
		         for (int j = 2; j < i; j++) {
		            if (i % j == 0) {
		               // i is divisible by j, so it is not prime
		               isPrime = false;
		               break;
		            }
		         }

		         // If i is prime, print it
		         if (isPrime) {
		            System.out.print(i + " ");
		         }

		         // Increment i and continue the loop
		         i++;
		      }
		   }
		}
