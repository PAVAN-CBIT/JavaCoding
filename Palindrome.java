/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int x=12121;
		int n=x;
        int l=0;
        int r=0;
        while(n>0){
            l=n%10;
            r=(r*10)+l;
            n=n/10;
        }
        if(r==x)
        	System.out.println("Palindrome");
        else
        	System.out.println("Non Palindrome");
	}
}
