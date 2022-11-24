public class example18_04_03
{
	public static void main(String[] args) 
	{
		int arr_i = 11;
		int arr_j = 23;
		
		Integer[][] arr = new Integer[arr_i][arr_j];
		
		
		for(int i=0;i<arr_i;i++) 
		{
			for (int j=0;j<arr_j;j++)
			{
				arr [i][j] = 2;
			}
		}
		
		Print_arr print = new Print_arr();
		
		print.pprint(arr);		
	}
}

class Print_arr 
{
	public void pprint(Integer[][] arr)
	{
		for(Integer[] row: arr)
		{
		    for(int element: row) {System.out.print(element);}
		    System.out.println();
		}   
	}
}