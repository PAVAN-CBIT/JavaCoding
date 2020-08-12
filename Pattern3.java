/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i;
		int j;
		int n=5;
		int k;
		for(i=n;i>0;i--)
		{
		    for(j=0;j<i-1;j++)
		    {
		        System.out.print(" ");
		        
		    }
		    for(k=i;k<=n;k++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
	}
}
