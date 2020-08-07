/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		String s1 ="abc";
		String s2 = "";
		for(char c: s1.toCharArray())
		{
		    s2=c+s2;
		    
		}
		if(s2==s1)
		{
		    System.out.println("palindrome");
		}
	   else
	{
	    System.out.println(" not palindrome");
	    
	}
}
    
}

