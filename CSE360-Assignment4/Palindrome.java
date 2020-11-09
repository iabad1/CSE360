package Palindrome;


/**
 * 
 * @author Isiah Abad 
 * , Class ID: 1214560659
 * , Assignment #4
 * {@summary }
 * The Palindrome class takes a string input and returns true if the string is a palindrome. 
 */

public class Palindrome {

private String testString; 
	
/**
 * The Palindrome method initializes the testString with the input string. 
 * @param input is the string from the JUnit test case 
 *
 */
	public Palindrome(String input) {
		//initializing testString
		testString = input;
	}
	
/**
 * The isPalindrome method takes the testString string and checks if it is a palindrome. 
 * @return isPalidrome is set to true or false depending on if the input is a palindrome. 
 */
	public boolean isPalindrome() {
		
		//initializing variables
		boolean isPalindrome = true; //dummy value
		String lettersOnly = testString.replaceAll("[\\W]", "");
		String word = lettersOnly.toLowerCase();//lowercase the testString
		int i = 0; 
		int j = word.length() - 1; //index of the last character in string
		
		
		//check if word is palindrome
		while(i < j) {
			
			if(word.charAt(i) != word.charAt(j)) {
				isPalindrome = false; //false if characters do not match
			}
			
			//increment and decrement index
			i++;
			j--;
		}
		
		return isPalindrome; 
		
	}
}
