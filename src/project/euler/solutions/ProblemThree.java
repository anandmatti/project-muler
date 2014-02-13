package project.euler.solutions;

/*
* Project Muler: Project Euler problem solutions
* Solution For:
* ***********************************
* Problem 2 : Largest prime factor
* ***************************************************
* 
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
* 
* ***************************************************
* 
* Author: Anand Mattikopp
*
*/

public class ProblemThree {
	static long[] Prime = new long[1000];
	static int primeCounter=4;
	public ProblemThree(){
		Prime[0]=1; /*Strictly speaking not a prime. Initialization just for the sake of it.
					 This is not to be used for any calculation.*/
		Prime[1]=2;
		Prime[2]=3;
		Prime[3]=5;
		Prime[4]=7;
	}
	
	public static void main(String[] args){
		ProblemThree prob3 = new ProblemThree();
		prob3.run();
	}
	
	public void run(){
		long number = 600851475143L;
		long highestPrimeFactor = highestPrimeFactor(number);
		System.out.println(highestPrimeFactor);
	}
	
	private long highestPrimeFactor(long number){
		
		if (isPrime(number)){
			return number;
		}
		
		long factor = 2;
		long highestPrimeFactor = 1;
		
		while (factor <= number/factor){
			if ((number%factor==0) && isPrime(factor)){
				if (factor > highestPrimeFactor){
					if (isPrime(number/factor)){
						factor = number/factor;
					}
					highestPrimeFactor = factor;
				}
			}
			factor = factor + 1;
		}
		
		return highestPrimeFactor;
	}
	
	public boolean isPrime(long number){
		int counter = 0;
		long factor = 0;
		boolean isPrime = true;	
		
		if (number==2){
			return true;
		} else if (number%2 == 0){
			return false;
		}
		
		while(isPrime && factor <= number/2){
			if (counter < primeCounter){
				counter = counter + 1;
				factor = Prime[counter];
		    }
			else{ 
				factor = factor + 2;
			}
			
			if (number%factor==0)
				isPrime=false;
		}
		
		return isPrime;
	}
}
