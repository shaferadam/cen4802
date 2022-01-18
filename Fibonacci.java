
public class Fibonacci 
{
		
	public static void main(String[] args) 
	{
		int n = 10;
		
		int y = F(n);
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
	}
	
	
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
			return F(n-1) + F(n-2);
		}
	}

}
