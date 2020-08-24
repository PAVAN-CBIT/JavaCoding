/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Longest_Sub_Sequence
{
   static int  max(int a ,int b)
    {
        if(a>b)
        {
          return a;  
        }
        else
        {
            return b;
        }
        
    }    
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
    
    
	  String x ="aggtab";
	  String y ="gxtxayb";
    
		char X[] =x.toCharArray();
		char Y[] =y.toCharArray();
    
    int m =X.length; 
		int  n =Y.length; 
    
		int[][] l = new int [m+1][n+1];
    
		int i; 
		int j; 
		for(i=0;i<=m;i++)
		{
		    for(j=0;j<=n;j++)
		   
		    {
		        if(i==0||j==0)
		        {
		            l[i][j]=0;
		        }
		        if(X[i-1]==Y[j-1])
		        {
		            l[i][j]=1+l[i-1][j-1];
		        }
		        else
		        {
		            l[i][j]=max(l[i-1][j],l[i][j-1]);
		        }
		    } 
		    
		    
		}
     System.out.println(l[m][n]);
		
	}
	
}

