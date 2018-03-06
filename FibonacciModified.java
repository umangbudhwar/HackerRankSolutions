# HackerRankSolutions
package com.umangbudhwar;

import java.math.BigInteger;

public class FibonacciModified {

	public static void main(String[] args) {
		System.out.println(fibonacciModified(0,1,10));
	}
	
	static BigInteger fibonacciModified(int t1, int t2, int n)
	{
		BigInteger ar[] = new BigInteger[n];
		ar[0] = new BigInteger(t1+"");
		ar[1] = new BigInteger(t2+"");
		for(int x = 2; x <= n-1; x++)
		{
			ar[x] = ar[x-2].add((ar[x-1]).pow(2));
		}
		return ar[n-1];
	}

}
