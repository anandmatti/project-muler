package project.euler.solutions;

/*
* Project Muler: Project Euler problem solutions
* Solution For:
* ***********************************
* Problem 6 : Sum Square Difference
* ***************************************************
* 
* The sum of the squares of the first ten natural numbers is,
*         12 + 22 + ... + 102 = 385
* The square of the sum of the first ten natural numbers is,
*        (1 + 2 + ... + 10)^2 = 55^2 = 3025
* Hence the difference between the sum of the squares of the first ten natural numbers
* and the square of the sum is 3025-385 = 2640.
* Find the difference between the sum of the squares of the first one hundred natural numbers 
* and the square of the sum.
* 
* ***************************************************
* 
* Author: Anand Mattikopp
*
*/

public class ProblemSix {
	
	public static void main(String[] args){
		ProblemSix prob6 = new ProblemSix();
		prob6.run();
	}
	
	public void run(){
		long totalNaturalNumber = 100;
		long sumOfNumbers = 0;
		long sumOfSquares = 0;
		long squareOfSums = 0;
		long difference;
		
		for (int i=1; i<=totalNaturalNumber;i++){
			sumOfNumbers = sumOfNumbers + i;
			sumOfSquares = sumOfSquares + square(i);
		}
		squareOfSums = square(sumOfNumbers);
		difference = squareOfSums - sumOfSquares;
		
		System.out.println(difference);
	}
	
	public long square(long num){
		return num*num;
	}
}
