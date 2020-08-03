/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Reduce_Number
{
	public static void main(String[] args)
	{
		int num =16;
		int n=num;
		int c=0;
		while(n>0)
		{
			if(n%2==0) // If number is divisible with 2 then making half the element
			{
				n=n/2;
				c++;
			}
			else // If number is not divisible then doing 1 minus
			{
				n=n-1;
				c++;
			}
		}
		System.out.println(c);
	}
}
