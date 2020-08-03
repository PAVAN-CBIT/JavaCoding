/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
        public class GoodPairs
        {
           public static void GoodPairs(String[] args)
         {
        
              int A[]={1,1,1,1};     //Defining an array
              int n=A.length;        //calculating array length
              
              //Declaration of variables
              
              int i;
              int j;
              int c=0;
              for(i=0;i<n;i++)
              {
                        for(j=i+1;j<n;j++)
                        {
                                      if(A[i]==A[j]){
                                          c++;
                                }
                        }

              }
                   System.out.println(c);
           }

        }
