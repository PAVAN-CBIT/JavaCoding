/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Methods
{
    
    
    static int addition(int a,int b)
    {
        int c;
        c=a+b;
        return c;
        
    }
    
    
    static int divison(int a,int b)
    {
        int c;
        c=a/b;
        return c;
    }
    
    
    static int subtraction(int a, int b)
    {
        int c ;
        c= a-b;
        return c;
        
    }
    
    
    static int multi(int a,int b)
    {
        
        int c;
        c=a*b;
        return c;
    }
    
    
    static int max2(int a,int b)
    {
        if(a>b)
        {
            return a;
        }else
        {
            return b;
        }
        
    }
    
    
    static void swap(int a,int b)
    {
        System.out.println("Before Swap = "+a+","+b);
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("After Swap = "+a+","+b);
      //  return c;
    }
    
    public static void even(int a)
    { 
        if(a%2==0)
            System.out.println("even");
        
        
    }
    public static void odd(int a)
    {
        if(a%2==1)
        System.out.println("odd");
    }
    
    
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int a =2;
		int b =4;
		System.out.println("Addition =  "+addition(a,b));
		System.out.println("Division = "+divison(a,b));
		System.out.println("Subtraction = "+subtraction(a,b));
		System.out.println("Multi = "+multi(a,b));
		System.out.println("Max2 = "+max2(a,b));
	//	System.out.println(swap(a,b));
	    swap(a,b);
	    even(a);
	    odd(5);
	    
	}
}
