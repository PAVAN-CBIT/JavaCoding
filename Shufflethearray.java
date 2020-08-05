/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Shufflethearray
{
	  public static void Shufflethearray(String[] args)
	{
	
    
	   int A[]={2,5,1,3,4,7};        //Defining an array A
     int m=A.length;               //Calculating array length
     int n=m/2;
     
         
     int i;                        //Declaring variables
     int B[]=new int[m];           //Defining an New array B
     
    
      for(i=0;i<m;i++)
      
        {
            if(i%2==0)
            {
                B[i]=A[i/2];
            }
            else
            {
                
                int j = (i/2)+n;
               
                B[i]=A[j];
                
             }
             
        }
          //printing the output values
          for(int k=0;k<m;k++)  
        {
           System.out.println(B[k]);
        }
    }
    
}


