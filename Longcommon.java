public class 
{
    public static int lcs(char[] X, char[] Y, int m, int n)
    {
        
        
        
        int[][] l =new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
        
                if(i==0||j==0)
                
                {
                    l[i][j]=0;
                }
                
                else
                if(X[i-1]==Y[j-1])
                
                
                {
    
                    l[i][j]=l[i-1][j-1]+1;    
                }
                
                else
                {
                    l[i][j]= max(l[i-1][j],l[i][j-1]);
            
                }
        
            }
        }
        return l[m][n];
        
    }
    
    
    
    
    
    
    
    public static int max(int a, int b)
    {
        if(a>b)
            return a;
        return b;
    }
    
    
    
    
	public static void main(String[] args)
  {
		
		int res;
		String s1="abaa";
        String s2="abbaca";
        
         char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        
        int m;
        int n;
        m=s1.length();
        n=s2.length();
		res = lcs(X,Y,m,n);
		System.out.println(res);
	}
}
