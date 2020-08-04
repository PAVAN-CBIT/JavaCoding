public class Runningsum
{
	 public static void Runningsum(String[] args)
    {
		System.out.println("Hello World");
    
		int A[]={1,2,3,4};     //Defining an array
		int n = A.length;      //Calculating array length
    
    
               //Declaring variables
    
		int i;
		int j;
		int B[]=new int[n];
		B[0]=A[0];
		for(i=1;i<n;i++)
                   {
		     B[i]=A[i]+B[i-1];
		   } 
		     for(j=0;j<n;j++) 
                      {
                         System.out.println(B[j]);
		      }
     }
	
}		   
