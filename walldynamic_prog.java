
		int A[][] = {{3,5,1,1},{2,3,3,2},{5,5},{4,4,2},{1,3,3,3},{1,1,6,1,1}};  //Defining an 2D array
	//	int k =W[i].length();
	    //int B[] = new int[k];
	    int l;                                      // Declare length
	    
	    int r=6;                                  //Defining row
	    int m=10;                                 //Defining length      
	    
	    int[] cuts =new int[m];                  //Defining an new array     
	    
	    for(int i=0;i<r;i++)                   
	    {
	        int k =A[i].length;                //calculateing length
	        l=0;
	        for(int j=0;j<k-1;j++)
	        {
	            l=l+A[i][j];
	            cuts[l]=cuts[l]+1;         //calculateing cuts
	        }
	        
	    }
	    int min =0;                     //Calculateing max in the array
	    int index=0;
	    for(int z=0;z<m;z++){
	    //	System.out.println(cuts[z]);
	    	if(cuts[z]>min){
	    		min = cuts[z];
	    		index = z;
	    	//	System.out.println(cuts[z]);
	    	}
	    }
	    
	    System.out.println(m- index); 
