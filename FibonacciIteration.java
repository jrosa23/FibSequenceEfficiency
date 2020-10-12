/* Written by Jeremy A. Rosario
 * Date: 10/11/2020
 * Professor Dhrgam Al Kafaf
 * 
 * Assignment 5:
 * Implement a recursive and Iterative version of the Fibonacci Sequence,
 * then examine and compare their runtimes for efficiency. After output
 * the findings into a chart with time (in nanoseconds) on the Y axis and
 * the input on the X axis.
 * 
 * Lastly create documentation for your program, using best practices
 * from this module.
 */


import java.io.IOException;
import java.util.Arrays;


public class FibonacciIteration
{
	
	/*
	 * here I set the number of passes for the sequencing
	 * then establish variables to calculate the run time
	 * Fibonacci methods
	 */
	static int iter = 50;
	static int run = 35;
	static long start;
	static long stop;
	
	
	/*
	 * here I instantiate the functions and the arrays
	 * to store execution time
	 */
	static FibFunc fibonacci = new FibFunc();
	public static long[] recursiveArray = new long[iter];
	public static long[] iterativeArray = new long[iter];
	
	
	/*
	 * The method below is going to recall the recursive method
	 * as well as the iterative method up to the number of passes I've set
	 */
	public static void main (String[] args) throws IOException
	{
		
		for (int r = 1; r <= run; r++)
		{
			for(int i = 0; i < iter; i++)
			{
				recursiveArray[i] = doRecursive(i);
				iterativeArray[i] = doIterative(i);
			}
		}
	}
	
	
	/*
	 * recalls the iterative method and the recursive method
	 * for sequencing
	 */
	public static long doIterative(int p)
	{
		start = System.nanoTime();
		fibonacci.iterative(p);
		stop = System.nanoTime();
		return stop - start;
	}
	
	
	public static long doRecursive(int p)
	{
		start = System.nanoTime();
		for(int i = 0; i < p; i++)
		{
			fibonacci.recursive(i);
		}
		stop = System.nanoTime();
		return stop - start;
	}

}
	

