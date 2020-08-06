public class Fibanacci
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		int a,b,c;
		a=0;
		b=1;
		int i;
		System.out.print(a+" "+b);
		for(i=2;i<10;i++){
		   // System.out.print(a+" "+b);
		    c=a+b;
		    System.out.print(" "+c);
		    a=b;
		    b=c;
		   
		}
	}
}
