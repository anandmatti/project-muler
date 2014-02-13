package project.euler.solutions;

/*
* Project Muler: Project Euler problem solutions
* Solution For:
* ***********************************
* Problem 4 : Largest palindrome product
* ***************************************************
* 
* A palindromic number reads the same both ways. The largest palindrome made from the product of 
* two 2-digit numbers is 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
* 
* ***************************************************
* 
* Author: Anand Mattikopp
*
*/

public class ProblemFour {
	
	public static void main(String[] args){
		ProblemFour prob4 = new ProblemFour();
		prob4.run();
	}
	
	public void run(){
		int firstNumber=999;
		int secondNumber=999;
		int highestPalindrome = 0;
		boolean done = false;
		while (!done && firstNumber>0){
			boolean palindromeFound = false;
			while(!palindromeFound && secondNumber>0){
				Integer product = firstNumber*secondNumber;
				if (isPalindrome(product.toString())){
					palindromeFound = true;
					if (product > highestPalindrome)
						highestPalindrome = product;
					else
						done = true;
				}
				secondNumber = secondNumber - 1;
			}
			firstNumber = firstNumber -1;			
		}
		
		System.out.println(highestPalindrome);
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	
	public boolean isPalindrome(String str){
		boolean isPalindrome = false;
		if (str!=null){
			if (str.equalsIgnoreCase(reverseString(str))){
				isPalindrome = true;
			}
		}
		return isPalindrome;
	}
	
	public String reverseString(String str){
		String revString="";
		int i = str.length();
		while (i>0){
			String subString = str.substring(i-1, i);
			revString = revString.concat(subString);
			i = i-1;
		}
		
		return revString;
	}
}
