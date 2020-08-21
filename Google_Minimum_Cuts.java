public class Google_Minimum_Cuts
{
	public static void main(String[] args)
	{
		int A[][] = {{3,5,1,1},{2,3,3,2},{5,5},{4,4,2},{1,3,3,3},{1,1,6,1,1}}       //Defining an 2D array
		int l;                                                                     //Defining variables     
		int r=6; // No of rows in the wall
		int m=10; // Lebgth of the wall
		int[] cuts =new int[m];                                                    //Defining an New array
		for(int i=0;i<r;i++)
		{
			int k =A[i].length;                                                  //calculateing length of an array 
			l=0;
			for(int j=0;j<k-1;j++)
			{
				l=l+A[i][j];
				cuts[l]=cuts[l]+1;                                             //finding cuts
			}
		}
		int max =0;                                                          //calculateing max in the array
		int index=0;
		for(int z=0;z<m;z++) // Calculating the maximum cuts of index
		{
			if(cuts[z]>max) 
			{
				max = cuts[z];
				index = z;
			}
		}
		System.out.println(m- index);  // Printing the minimum no of cuts
	}
}
