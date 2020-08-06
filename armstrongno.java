public class Armstrongno
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int m=153;
		int n=m;
		int r;
		int result=0;
		
		while(n>0)
		{
		    r=n%10;
		    result=result+(r*r*r);
		    n=n/10;
		    
		}
		if(result==m)
		{
		    System.out.println("Number is Armstrong");
		    
		        
		    }
		    else
		    {
		        System.out.println("Number is not Armstrong");
		    }
		}
	}

