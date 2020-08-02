/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Swap
{
	public static void main(String[] args) {
		 //int[] A = new int[5];
			
		int a=5;
		int b=4;
		int t;
		
			
		System.out.println("Before swap");
		System.out.println(a+"\t"+b);
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After swap");
		System.out.println(a+"\t"+b);
	}
}
