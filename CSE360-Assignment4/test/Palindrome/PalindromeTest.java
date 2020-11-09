package Palindrome;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Isiah Abad 
 * , Class ID: 1214560659
 * , Assignment #4
 * {@summary }
 * The PalindromeTest class uses JUnit to test multiple test cases 
 * and calls the Palindrome class using a test input. 
 */

public class PalindromeTest {

	@Test
	public void simpleCaseTest() {
		//this test case checks if the actual output is 
		//true for a basic palindrome string
		Palindrome test = new Palindrome("racecar"); //creates a test string
		boolean actualOutput =  test.isPalindrome(); //uses the test string to test if it is a palindrome 
		assertEquals(true, actualOutput); //checks if the actual output equals the expected output
	}
	
	@Test
	public void simpleNotPalindromeTest() {
		//this test case checks if the actual output 
		//is not a palindrome 
		Palindrome test = new Palindrome("scoop");
		boolean actualOutput = test.isPalindrome();
		assertEquals(false, actualOutput);
	}
	
	@Test
	public void ignoresCapitalizationTest() {
		//this test case checks if the output is 
		//true when a character is capitalized
		Palindrome test = new Palindrome("raCecar"); 
		boolean actualOutput =  test.isPalindrome(); 
		assertEquals(true, actualOutput);
		
	}
	@Test
	public void allCapsTest() {
		//this test case checks if the output is true 
		//when the input is capitalized
		Palindrome test = new Palindrome("HANNAH");
		boolean actualOutput = test.isPalindrome();
		assertEquals(true, actualOutput);
	}
	
	
	@Test 
	public void alphaNumericStrinTest() {
		//this test case checks if the actual output 
		//is true for an alphanumeric and palindrome string 
		Palindrome test = new Palindrome("13aaa31");
		boolean actualOutput = test.isPalindrome();
		assertEquals(true, actualOutput);
	}
	
	@Test 
	public void punctuationTest() {
		//this test case checks if the actual output returns 
		//true for a palindrome string with punctuation marks
		Palindrome test = new Palindrome("te?r r!'et");
		boolean actualOutput = test.isPalindrome();
		assertEquals(true, actualOutput);
	}
	@Test 
	public void notPalindromePunctuationTest() {
		//this test case checks if the actual output returns 
		//false for a non-palindrome string with punctuation marks
		Palindrome test = new Palindrome("t?rr!'et");
		boolean actualOutput = test.isPalindrome();
		assertEquals(false, actualOutput);
	}
	@Test 
	public void whitecaseTest() {
		//this test case checks if the actual output is true 
		//when testing for white spaces within a palindrome string
		Palindrome test = new Palindrome("ro t or");
		boolean actualOutput = test.isPalindrome();
		assertEquals(true, actualOutput);
	}
	
	
}
