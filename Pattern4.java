/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Pattern4
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i;
		int j;
		int n=4;
		int k;
		for(i=0;i<n;i++)
		{
		    for(k=0;k<i;k++)
		    {
		        System.out.print(" ");
		    }
		    for(j=i;j<n;j++)
		    {
		        System.out.print("*");
		    }System.out.println("");
		}
		
	}
}
