package project.euler.solutions;

/*
* Project Muler: Project Euler problem solutions
* Solution For:
* ***********************************
* Problem 5 : Smallest multiple
* ***************************************************
* 
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* 
* ***************************************************
* 
* Author: Anand Mattikopp
*
*/

public class ProblemFive {

	public static void main(String[] args){
		ProblemFive prob5 = new ProblemFive();
		prob5.run();
	}
	
	public void run(){
		int maxNumber = 20;
		long lcm = maxNumber;
		for (int i=1; i<maxNumber;i++){
			if (lcm%i!=0){
				lcm = LCM(lcm,i);
			}
		}
		
		System.out.println(lcm);
	}
	
	public long LCM(long num1, long num2){
		long lcm = num1;
		if (num1==num2){
			return lcm = num1;
		}else{
			long biggerNum, smallerNum;
		
			if (num1>num2){
				biggerNum = num1;
				smallerNum = num2;
			}
			else{
				biggerNum = num2;
				smallerNum = num1;
			}
			int i=1;
			boolean done= false;
			while(!done && i<=smallerNum){
				if ((biggerNum*i)%smallerNum ==0){
					lcm = biggerNum*i;
					done = true;
				}
				i = i+1;
			}
		}
		return lcm;
	}
}
