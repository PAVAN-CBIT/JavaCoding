/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Reduce_Number
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int n;
		int num =16;
        n=num;
        int c=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
                c++;
            }
            else{
                n=n-1;
                c++;
            }
        }
        
        System.out.println(c);
    }
}
