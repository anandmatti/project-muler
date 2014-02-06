package project.euler.solutions;

/*
* Project: Project Euler Problem Solutions
* Class: Solution to Problem 1
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
