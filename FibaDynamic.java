/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static int fiba(int n)
    {
        //int n =5;
        int[] F= new int[n+1];
        
        
        F[0]=0;
        F[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            F[i]=F[i-2]+F[i-1];
            
        }
        
        return F[n];
    }
    
	public static void main(String[] args)
	{
	   int n=7;
	   int res;
	   res = fiba(n);
	    System.out.println("Fibonacci of "+n+" = "+res);
		         
		     
		
	}
}
