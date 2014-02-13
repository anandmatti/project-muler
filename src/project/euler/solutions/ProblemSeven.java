package project.euler.solutions;

/*
* Project Muler: Project Euler problem solutions
* Solution For:
* ***********************************
* Problem 7 : 10001st Prime
* ***************************************************
* 
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10001st prime number?

* 
* ***************************************************
* 
* Author: Anand Mattikopp
*
*/

public class ProblemSeven {
	
	public static void main(String[] args){
		ProblemSeven prob7 = new ProblemSeven();
		prob7.run();
	}
	
	public void run(){
		long n = 10001;
		long nthPrime = nthPrime(n);
		System.out.println(nthPrime);
	}

	public long nthPrime(long n){
		
		if (n < 1)
			return -1;
		else if (n==1)
			return 2;
		else if (n==2)
			return 3;
		
		long primeCount = 2;
		long nthPrime = 3;
		boolean primeFound;
		while (primeCount < n){
			primeFound = false;
			while(!primeFound){
				nthPrime = nthPrime+2;
				ProblemThree primeFinder = new ProblemThree();
				if (primeFinder.isPrime(nthPrime)){
					primeFound = true;
					primeCount = primeCount +1;
				}
			}
		}
		
		return nthPrime;
	}
}