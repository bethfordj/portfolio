package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;

public class LectureTest {

	// Define a variable for the class being tested
	private Lecture lecture;
	
	@Before
	public void setup() {
		lecture = new Lecture();
	}
	
	@After
	public void cleanUpTest() {
		System.out.println("After");
	}
	
	/* or35 - Boolean Results */
	@Test
	public void multiple_of_3_but_not_5_returns_true() {
		// Arrange
		// Act
		boolean result = lecture.or35(9);
		// Assert
		Assert.assertTrue(result);
	}
	
	@Test
	public void multiple_of_5_but_not_3_returns_true() {
		// Arrange
		// Act
		boolean result = lecture.or35(25);
		// Assert
		Assert.assertTrue(result);
	}
	
	@Test
	public void multiple_of_both_5_and_3_returns_true() {
		// Arrange
		// Act
		boolean result = lecture.or35(45);
		// Assert
		Assert.assertTrue(result);
	}
	
	@Test
	public void not_a_multiple_of_3_or_5_returns_false() {
		// Arrange
		// Act
		boolean result = lecture.or35(97);
		// Assert
		Assert.assertFalse(result);
	}
	
	@Test
	public void zero_returns_true() {
		// Assert           //Act
		Assert.assertTrue(lecture.or35(0));
	}
	
	/* caught speeding - Integer Results */
	@Test
	public void driving_65_when_not_birthday_results_in_small_ticket() {
		// Arrange
		// Act
		int ticket = lecture.caughtSpeeding(65, false);
		// Assert
		Assert.assertEquals(1, ticket);
	}
	
	@Test
	public void driving_65_when_birthday_results_in_no_ticket() {
		// Arrange
		// Act
		int ticket = lecture.caughtSpeeding(65, true);
		// Assert
		Assert.assertEquals("Wrong ticket value return", 0, ticket);
	}
	
	// firstTwo - String results */
	@Test
	public void string_of_length_greater_than_2_returns_first_2_letters() {
		// Arrange
		// Act
		String result = lecture.firstTwo("Hello");
		// Assert
		Assert.assertEquals("He", result);
	}
	
	/* Using an Assert.fail() */
	@Test
	public void empty_string_returns_an_empty_string() {
		String result = lecture.firstTwo("");
		
		//Assert.assertEquals("", result);
		if (result.equals("") == false) {
			Assert.fail("Did not return empty string");
		}
	}
	
	/* no4LetterWords -- Testing with an Array or Collection */
	@Test
	public void list_does_not_include_4_letter_words() {
		// Arrange
		String[] words = {"Train", "Boat", "Car"};
		String[] expectedResults = {"Train", "Car"};
		
		// Act
		List<String> resultList = lecture.no4LetterWords(words);
		
		// Assert
		Assert.assertNotNull(resultList);
		Assert.assertTrue(resultList instanceof List);
		String[] actualResults = resultList.toArray(new String[resultList.size()]);
		Assert.assertArrayEquals(expectedResults, actualResults);
		
	}
	
	/* RobPeterToPayPaul -- Testing with a Map */
	@Test
	public void half_of_peters_money_given_to_paul() {
		// Arrange
		Map<String, Integer> peterPaul = new HashMap<String, Integer>();
		peterPaul.put("Peter", 2000);
		peterPaul.put("Paul", 500);
		
		// Act
		Map<String, Integer> resultMap = lecture.robPeterToPayPaul(peterPaul);
		
		// Assert
		Assert.assertEquals(new Integer(1000), resultMap.get("Peter"));
		Assert.assertEquals(new Integer(1500), resultMap.get("Paul"));
	}
	
	/* Testing with Double -- no rounding error */
	@Test
	public void third_of_9_is_3() {
		// Arrange
		// Act
		double result = lecture.thirdDouble(9);
		Assert.assertEquals(3, result, 0);  // third argument is number of signifance after the decimal
	}
	
	/* Testing with Double -- with floating point rounding error */
	@Test
	public void third_of_5_is_1_66() {
		// Arrange
		// Act
		double result = lecture.thirdDouble(5);
		// Assert
		Assert.assertEquals(1.66, result, 2);
	}
	
	/* Testing with our own objects */
	@Test
	public void return_our_dog_returns_our_dog() {
		// Arrange
		Dog ourDog = new Dog("Fiddo", "Beagle", 7);
		// Act
		Dog returnedDog = lecture.returnOurDog(ourDog);
		// Assert
		// assertEquals uses the objects .equals(), so only works with an Override of .equals()
		Assert.assertEquals(ourDog, returnedDog);
		
		// OR If not .equals() Override on object, then can build our own assert method
		assertDogsAreEqual(ourDog, returnedDog);
		
	}
	
	private void assertDogsAreEqual(Dog expected, Dog actual) {
		Assert.assertEquals("Names are not Equal", expected.getName(), actual.getName());
		Assert.assertEquals("Breeds are not Equal", expected.getBreed(), actual.getBreed());
		Assert.assertEquals("Ages are not Equal", expected.getAge(), actual.getAge());
	}
	
	
}
