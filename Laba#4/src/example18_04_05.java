import java.util.Random;

public class example18_04_05
{
	public static void main(String[] args) 
	{
		
		int arr_i = 5;
		int arr_j = 5;
		int tempNumb;
		
		Integer[][] arr = new Integer[arr_i][arr_j];
		
		Print_arr print = new Print_arr();

		Random rand = new Random();
				
		for(int i=0;i<arr_i;i++) 
		{
			for (int j=0;j<arr_j;j++)
			{
			    arr[i][j] = rand.nextInt(0, 10);
			}
		}
	
		print.pprint(arr);
		
		for(int i=0;i<arr_i;i++) 
		{
			for (int j=0;j<arr_j;j++)
			{
			    if (i!=j)
			    {
			    	tempNumb = arr[i][j];
			   		arr[i][j] = arr[j][i];
			   		arr[j][i] = tempNumb;  	
			    }else {break;}
			}
		}
		
		System.out.println();
		
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