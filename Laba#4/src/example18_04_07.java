public class example18_04_07
{
	public static void main(String[] args) 
	{
		int arr_i = 5;
		int arr_j = 5;
		int k = 0, c = 1;
		int x = 0;
		int y = arr_j;
		int i = arr_i;
		int j = arr_j-1;
		
		int[][] arr_2 = new int[arr_i][arr_j];
		
		for (;k<arr_j;)
		{
			while (i>x)
			{
				if (x==y) {break;}
				arr_2[k][x] = c;
				x++;
				c++;
			}
			
			
			while (j >= 0)
			{
				if (arr_2[j][y-1] != 0) {break;}
				arr_2[j][y-1] = c;
				c++;
				j--;
			}
			
			k++;
			y--;
			x = 0;
			j = arr_j-1;
			
		}

		for(int[] row: arr_2)
		{
		    for(int element: row) 
		    {
		    	if (element<10) 
		    	{
			    	System.out.print(element+"  ");
		    	}else 
		    	{
			    	System.out.print(element+" ");
		    	}
		    }
		    System.out.println();
		}  
	}
}