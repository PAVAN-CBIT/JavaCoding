public class Validparanthesis
{
	 
    public static void Validparanthesis(String[] args)
	{


        Stack<Character> s1= new Stack<Character>();
		    String s= "()";
		
		    for(char i: s.toCharArray())  
        {
			    if(i=='c')
			   {
				   s1.push(')');
			   }
			  else if(i=='[')
			  {
				  s1.push(']');
			  }
			  else if(i=='{')
			 {
				s1.push('}');
			 }
			  else if(s1.isEmpty() || s1.pop()!=i)
			 {
				 System.out.println("Not Valid");
			 }
			
		   }
		   if(s1.isEmpty())
			  {
				 System.out.println("Valid");
			  }
		else {
			 {
				System.out.println("Not Valid");
	 }
 }
