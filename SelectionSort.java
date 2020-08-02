/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SelectionSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int A[]={64,25,12,22,11}; // Declaration of the Array in java
		 int n=5; // Dynamic way of finding no.of elements in the array using A.lenght
     
     // Defining the variable which required in the programm
		 int i;
		 int j;
		 int t;
     
     
		 for(i=0;i<n-1;i++) // Outer for loop for fixing the each "i" element
     {
		     t=i; // Taking "i" index element as minimum element
         
		     for(j=i+1;j<n;j++) // Inner loop is running from "i+1" to n
         {
		         if(A[t]>A[j]) //comparision  for minimum element 
             { 
		           t=j; // Changing the index of minimum element
		         }
		     }
         //swaping
		      int t1 = A[t];
		             A[t]=A[i];
		             A[i]=t1;
     }
     
    //printing sorted elements
    for(int k=0;k<n;k++)
    {
        System.out.println(A[k]);
    }
	}
}
