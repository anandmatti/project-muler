package project.euler.solutions;

/*
* Project: Project Euler Problem Solutions
* Solution For:
* ***********************************
* Problem 1 : Multiples of 3 and 5
* ********************************************
* 
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
* The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
* 
* ********************************************
* 
* Author: Anand Mattikopp
* 
*/

public class ProblemOne {
	
	public static void main(String[] args){
		ProblemOne prob1 = new ProblemOne(); 
		prob1.run();
	}
	
	public void run(){
		int sumOfMultiplesOfThreeOrFive;
		int maxLimit = 1000;
		
		sumOfMultiplesOfThreeOrFive = sumOfMultiples(maxLimit, 3) + sumOfMultiples(maxLimit, 5)
				                      - sumOfMultiples(maxLimit, 15);
		
		System.out.println(sumOfMultiplesOfThreeOrFive);
	}
	
	private int sumOfMultiples(int maxNumber, int factor){
		int i = factor;
		int sum = 0;
		while (i<=maxNumber){
			sum = sum + i;
			i = i + factor;
		}
		
		return sum;
	}
}
