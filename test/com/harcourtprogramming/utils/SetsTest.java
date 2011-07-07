package com.harcourtprogramming.utils;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * TODO: Product Test
 * TODO: Document SetsTest
 * @author Benedict Harcourt
 */
public class SetsTest
{
	public SetsTest()
	{
	}

	/**
	 * TODO: Document unionTest()
	 */
	@Test
	public void unionTest()
	{
		Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(2, 3, 4));

		Set<Integer> c = Sets.union(a, b);
		assertEquals(4, c.size());

		c.remove(3);
		assertEquals(3, c.size());
		c.remove(1);
		assertEquals(2, c.size());
		c.remove(2);
		assertEquals(1, c.size());
		c.remove(4);
		assertEquals(0, c.size());

	}

	/**
	 * TODO: Document intersectionTest()
	 */
	@Test
	public void intersectionTest()
	{
		Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(2, 3, 4));

		Set<Integer> c = Sets.intersection(a, b);
		assertEquals(2, c.size());

		c.remove(3);
		assertEquals(1, c.size());
		c.remove(2);
		assertEquals(0, c.size());
	}
}
