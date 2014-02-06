package project.euler.solutions;

/*
* Project: Project Euler Problem Solutions
* Class: Solution to Problem 2
* Author: Anand Mattikopp
* 
*/
public class ProblemTwo {
	Long[] fibonacci;
	Long maxLimit;
	
	public ProblemTwo(){
		fibonacci = new Long[1000];
		fibonacci[0]=new Long(1);
		fibonacci[1]=new Long(1);
	}
	
	public ProblemTwo(Integer size, Long maxLimit){
		if (size!=null){
			fibonacci = new Long[size];
		}
		else 
			fibonacci = new Long[1000];
		
		if (size==null || size > 0)
			fibonacci[0]=new Long(1);
		if (size==null || size > 1)
			fibonacci[1]=new Long(1);
		
		this.maxLimit = maxLimit;
	}
	
	public static void main(String[] args){
		ProblemTwo prob2 = new ProblemTwo(); 
		prob2.run();
	}

/**
 * run method uses fibonacci method to solve the Problem 2 or Project Euler. 
 */
	public void run(){
		long sumOfEvenFibonacci = 0;
		int i=1;
		long currentFibonacci = fibonacci(1);
		
		if (maxLimit == null)
			maxLimit = new Long(4000000);
		
		while (currentFibonacci <= maxLimit){
			if (currentFibonacci % 2 == 0){
				sumOfEvenFibonacci = sumOfEvenFibonacci + currentFibonacci;
			}
			i = i+1;
			currentFibonacci = fibonacci(i); 
		}
		
		System.out.println(sumOfEvenFibonacci);
	}
	
/**
 * fibonacci is a method to return the nth number in the Fibonacci sequence. 
 * @param n : Long type parameter.
 * @returns nth  number in Fibonacci Sequence.
 */
	public long fibonacci(int n){
		if (fibonacci[n]==null) {
			int last = n-1;
			int secondLast = n-2;
			long lastFibonacci,secondLastFibonacci;
			if (fibonacci[secondLast]== null){
				secondLastFibonacci = fibonacci(secondLast);
			} else{
				secondLastFibonacci = fibonacci[secondLast]; 
			}
		
			if (fibonacci[last]== null){
				lastFibonacci = fibonacci(last);
			} else{
				lastFibonacci = fibonacci[last]; 
			}
		
			fibonacci[n]=lastFibonacci+secondLastFibonacci;
		}
		
		return fibonacci[n];
	}
	
}
