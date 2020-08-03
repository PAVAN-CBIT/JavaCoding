/******************************************************************************

How Many Numbers Are Smaller Than the Current Number

Writing in the JAVA code.

*******************************************************************************/
public class Numbers_Smaller
{
  public static void main(String[] args) 
  {
    //	System.out.println("Hello World");
    int A[]={8,1,2,2,3};
    int n=A.length; // Calculating the Array length
    int i;
    int j;
    int c=0;
    int k;
    int B[]=new int[n]; // Dclearation of the Array B

    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(A[i]>A[j])
        {
          c++;
        }
      }
      B[i]=c; // Appending the "C" value into the Array "B"
      c=0;
      // print.out.println(c);
    }
    // Printing the Output of the Array values "B"
    for(k=0;k<n;k++)
    {
      System.out.print(B[k]+" ");
    }
  }
}
