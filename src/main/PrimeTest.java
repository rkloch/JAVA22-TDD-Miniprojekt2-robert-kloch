package main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	@AfterEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	@Test
	@DisplayName("Correct output should be 3 prime numbers between 3 and 10")
	void testPrimeBetweenTwoAndTen() {
		Prime prime = new Prime(3, 10);
		prime.printCount();
		assertEquals("Hej, det finns 3 primtal mellan 3 och 10!", outputStreamCaptor.toString().trim());
	}
	
	@Test
	@DisplayName("Correct output should be 2 primenumbers between 5 and 10")
	void testPrimeBetweenFiveAndTen() {
		Prime prime = new Prime(5, 10);
		prime.printCount();
		assertEquals("Hej, det finns 2 primtal mellan 5 och 10!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because of negative integer in lower bound")
	void testNegativeLowerBound() {
		Prime prime = new Prime(-1, 100);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because higher bound is lower than lower bound")
	void testHigherBoundLowerThanLowerBound() {
		Prime prime = new Prime(100, 99);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because higher bound is negative")
	void testNegativeHigherBound() {
		Prime prime = new Prime(0, -1);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	
	
	@Test
	@DisplayName("Should be wrong interval because both bound is the same number")
	void testBothBoundsIsEqual() {
		Prime prime = new Prime(0, 0);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because higher bound is too high")
	void testHigherBoundTooHigh() {
		Prime prime = new Prime(1000, 1001);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because both bounds is too high")
	void testBothBoundsTooHigh() {
		Prime prime = new Prime(1001, 1002);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be wrong interval because both bounds is negative")
	void testBothBoundsNegative() {
		Prime prime = new Prime(-1, -1);
		assertEquals("Hoppsan, fel intervall angivet!", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("Should be correct 4 primes between zero and ten")
	void testCorrectPrimesBetweenZeroAndTen() {
		Prime prime = new Prime(0, 10);
		prime.printCount();
		assertEquals("Hej, det finns 4 primtal mellan 0 och 10!", outputStreamCaptor.toString().trim());

	}
	
	@Test
	@DisplayName("The sum of primes should be 17 between zero and ten")
	void testGetSumBetweeenZeroAndTen() {
		Prime prime = new Prime(0, 10);
		prime.printSum();
		assertEquals("Och den totala summan av dessa primtal är 17.", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be 14 primes between 900 and 1000")
	void testGetPrimesBetweenNinehundredAndThousand() {
		Prime prime = new Prime(900, 1000);
		prime.printCount();
		assertEquals("Hej, det finns 14 primtal mellan 900 och 1000!", outputStreamCaptor.toString().trim());

	}
	
	@Test
	@DisplayName("The sum of primes should be 13330 between 900 and 1000")
	void testGetSumBetweenNinehundredAndThousand() {
		Prime prime = new Prime(900, 1000);
		prime.printSum();
		assertEquals("Och den totala summan av dessa primtal är 13330.", outputStreamCaptor.toString().trim());
	}
	@Test
	@DisplayName("Should be 0 primes between 8 and 10")
	void testGetPrimesBetweenEightAndTen() {
		Prime prime = new Prime(8, 10);
		prime.printCount();
		assertEquals("Hej, det finns 0 primtal mellan 8 och 10!", outputStreamCaptor.toString().trim());
	}

}
