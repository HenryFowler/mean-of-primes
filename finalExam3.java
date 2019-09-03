import java.util.ArrayList;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class finalExam3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  DecimalFormat df = new DecimalFormat("0.00");
  boolean primeNumberFound = false;
  ArrayList<Integer> primes = new ArrayList<Integer>();
  double total = 0; 
  double mean = 0; 
  double divby = 1; 
  int usernum = 0; 
  
  System.out.print("Please enter a maximum for your prime numbers: "); 
  usernum = getInput(0); 
  
  for (int i=1; i< usernum; i++) {
   primeNumberFound = isPrime(i);
   if (primeNumberFound == true) {
     //System.out.println ("YAY = we found that " + i + " is prime!");
     //System.out.println ("Adding..."); 
     primes.add(i); 
   }
  }
for(int i=1; i<primes.size();i++)
{
	total = total + primes.get(i); 
	divby++; 
}
//System.out.println("Debug: total is " + total); 
//System.out.println("Debug: divby is " + divby); 
mean = total/divby;
System.out.println("The mean of all primes from 0 to " + usernum + " is " + df.format(mean)); 
  
 }

 public static boolean isPrime(int n) {
     for(int i = 2; i < n; ++i) {
         if (n % i == 0) {                // if the number has a divisor other than 1 or itself, we return immediately.
             return false;
         }
     }
     return true;
 }
 
 public static int getInput(int acceptNegative)
	
	{
		Scanner Keyboard = new Scanner(System.in);
		int output = 0; 
		boolean errorCheck = false; 
		String input = ""; 
		do
		{
			try 
			{
				input = Keyboard.next(); 
				output = Integer.parseInt(input.trim()); 
				errorCheck = false; 
			} catch(Exception e) { 
				System.out.print("Error! String input is not accepted. " );
				errorCheck = true;
			}
			if(output <= 0 && acceptNegative == 0 && errorCheck == false)
			{
				System.out.print("Error! Negative or zero input is not accepted. " );
				errorCheck = true; 
			}
			if(errorCheck == true)
			{
				System.out.print("Please retry: ");
			}
		} while (errorCheck == true);
		return output; 
	}
 
}