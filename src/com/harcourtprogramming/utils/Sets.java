package com.harcourtprogramming.utils;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Benedict
 */
public final class Sets
{
	private Sets()
	{
		// Nothing to see here. Move along, citizen!
	}

	public static <T> Set<T> union(Set<? extends T> a, Set<? extends T> b)
	{
		Set<T> u = new HashSet<T>(a);
		u.addAll(b);

		return u;
	}

	public static <T> Set<T> intersection(Set<? extends T> a, Set<? extends T> b)
	{
		Set<T> u = new HashSet<T>(a);
		u.retainAll(b);

		return u;
	}

	public static <A, B> Set<Tuple<A, B>> product(Set<? extends A> a,
					Set<? extends B> b)
	{
		final Set<Tuple<A, B>> ret = new HashSet<Tuple<A, B>>(a.size() * b.size());
		for (A aVal : a)
		{
			for (B bVal : b)
			{
				ret.add(new Tuple<A, B>(aVal, bVal));
			}
		}
		return ret;
	}
}
