
public class FibFunc
{
	/*
	 * Calculate the Fibonacci Sequence Iteratively
	 * then Recursively
	 */
	
	/* 
	 * establish the variables for the previous number
	 * and the next number as well as the sum 
	 * to be used in sequencing
	 * @param
	*/
		int prevNum1 = 0;
		int prevNum2 = 0;
		int nextNum = 1;
		int sum = 0;
	
	/*
	 * Fibonacci Sequenced Iteratively
	 */
	
	int iterative(int n)
	{
		/* @param is the 
		 * number of passes 
		 * denoted as n
		 */
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		for (int i = 2; i <= n; i++) 
		{
			sum = nextNum + prevNum1;
			nextNum = prevNum1;
			sum = nextNum;
		}
		return sum;
	}
	
	
	/*
	 * Fibonacci Sequenced Recursively
	 */
	
	int recursive (int n) 
	{
		/* @param is the 
		 * number of passes 
		 * denoted as n
		 */
		
		for (int i = 1; i < n; i++)
		{
			prevNum2 = prevNum1;
			prevNum1 = nextNum;
			nextNum = prevNum2 + prevNum1;
		}
		return nextNum;
	}
	
}
