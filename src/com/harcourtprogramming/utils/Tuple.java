package com.harcourtprogramming.utils;

import java.io.Serializable;

/**
 * TODO: Document Class
 * @param <A>
 * @param <B>
 * @author Benedict
 */
public class Tuple<A, B> implements Serializable, Cloneable
{
	private static final long serialVersionUID = 1L;
	private final A a;
	private final B b;

	/**
	 * TODO: DOcument Tuple(A, B)
	 * @throws IllegalArgumentException
	 * @param a
	 * @param b
	 */
	public Tuple(A a, B b)
	{
		if (a == null || b == null) throw new IllegalArgumentException(
							"Variables in a tuple may not be null");
		this.a = a;
		this.b = b;
	}

	@Override
	protected Tuple<A, B> clone()
	{
		return new Tuple<A, B>(a, b);
	}

	@Override
	@SuppressWarnings("unchecked") // TODO: Document supression
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (obj instanceof Tuple) return equals((Tuple<A, B>)obj);
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		int hash = 5;
		hash = 43 * hash + this.a.hashCode();
		hash = 43 * hash + this.b.hashCode();
		return hash;
	}

	/**
	 * TODO: Document equals(Tuple)
	 * @param t
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean equals(Tuple<A, B> t)
	{
		return a.equals(t.getA()) && b.equals(t.getB());
	}

	/**
	 * TODO: Document getA()
	 * @return the a
	 */
	public A getA()
	{
		return a;
	}

	/**
	 * TODO: Document getB()
	 * @return the b
	 */
	public B getB()
	{
		return b;
	}

	/**
	 * TODO: Document reverse()
	 * @return
	 */
	public Tuple<B, A> reverse()
	{
		return new Tuple<B, A>(b, a);
	}

	@Override
	public String toString()
	{
		return '<' + a.toString() + ',' + b.toString() + '>';
	}
}
