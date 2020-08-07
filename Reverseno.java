/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Reverseno
{
	public static void main(String[] args)
	{
	
	
		System.out.println("Hello World");
	int n=123;
	int resul=0;
	int r;
	while(n>0)
	{
	    r = n%10;
	    resul = resul*10+r;
	    n = n/10;
	    
	}
     	System.out.println(resul);	
	    
	
    }
    
}

