
/**
 * @author Adam Shafer
 * 
 * The Fibonnaci class includes the method F(n) which returns the nth term 
 * of the Fibonnaci sequence and a main method which tests this method.  
 * 
 */
public class Fibonacci 
{
		
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n = 10;
		
		int y = F(n);
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
	}
	
	
	/**
	 * The first two terms of the Fibonnacci sequence are F(0) = 0 and F(1) = 1.  Each remaining term can be found
	 * by adding the two preceding terms in the sequence:  F(n) = F(n-2) + F(n-1)
	 * 
	 * @param n A positive integer n
	 * @return The nth term of the Fibonacci sequence
	 */
	public static int F(int n)
	{
		if( n == 0)
		{
			return 0;
		}
		
		else if (n == 1)
		{
			return 1;
		}
		
		else
		{
			return F(n-2) + F(n-1);
		}
	}

}
