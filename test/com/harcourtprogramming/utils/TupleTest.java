package com.harcourtprogramming.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedict
 * TODO: Add tests for constructor
 * TODO: Add tests for reference immutability
 * TODO: Add tests for data mutability
 * TODO: Add test for equals reflexivity
 * TODO: Add test for equals symmetry
 * TODO: Add test for equals transitivity
 */
public class TupleTest
{
	/**
	 * Public constructor for use with JUnit
	 */
	public TupleTest()
	{
		// Nothing to see here. Move along, citizen!
	}

	/**
	 * Test of clone method, of class Tuple.
	 */
	@Test
	public void testClone()
	{
		Tuple<String, String> instance = new Tuple<String, String>("A", "B");
		Tuple<String, String> result = instance.clone();

		assertNotSame(instance, result);
		assertEquals(instance, result);
	}

	/**
	 * Test of equals method, of class Tuple.
	 */
	@Test
	public void testEquals()
	{
		Tuple<Integer, Integer> instance = new Tuple<Integer, Integer>(10, 20);
		Tuple<Integer, Integer> other = new Tuple<Integer, Integer>(10, 20);

		assertNotSame(instance, other);
		assertEquals(instance, other);
	}

	/**
	 * Test of hashCode method, of class Tuple.
	 */
	@Test
	public void testHashCode()
	{
		// TODO: Write test code.
	}

	/**
	 * Test of getA method, of class Tuple.
	 */
	@Test
	public void testGetA()
	{
		Integer expResult = 10;
		Tuple<Integer, Integer> instance = new Tuple<Integer, Integer>(expResult, 20);
		Integer result = instance.getA();

		assertEquals(expResult, result);
		assertSame(expResult, result);
	}

	/**
	 * Test of getB method, of class Tuple.
	 */
	@Test
	public void testGetB()
	{
		Integer expResult = 20;
		Tuple<Integer, Integer> instance = new Tuple<Integer, Integer>(10, expResult);
		Integer result = instance.getB();

		assertEquals(expResult, result);
		assertSame(expResult, result);
	}

	/**
	 * Test of reverse method, of class Tuple.
	 */
	@Test
	public void testReverse()
	{
		String sVal = "10";
		Integer iVal = new Integer(sVal);

		Tuple<String, Integer> instance = new Tuple<String, Integer>(sVal, iVal);
		Tuple<Integer, String> expResult = new Tuple<Integer, String>(iVal, sVal);

		Tuple<Integer, String> result = instance.reverse();

		assertNotSame(expResult, result);
		assertEquals(expResult, result);
		assertEquals(expResult.getA(), result.getA());
		assertEquals(expResult.getB(), result.getB());
		assertSame(expResult.getA(), result.getA());
		assertSame(expResult.getB(), result.getB());

		Tuple<String, Integer> result2 = result.reverse();

		assertNotSame(instance, result2);
		assertEquals(instance, result2);
		assertEquals(instance.getA(), result2.getA());
		assertEquals(instance.getB(), result2.getB());
		assertSame(instance.getA(), result2.getA());
		assertSame(instance.getB(), result2.getB());
	}

	/**
	 * Test of toString method, of class Tuple.
	 */
	@Test
	public void testToString()
	{
		Tuple<Integer, Integer> instance = new Tuple<Integer, Integer>(10, 20);

		String expResult = "<10,20>";
		String result = instance.toString();

		assertEquals(expResult, result);
	}
}
