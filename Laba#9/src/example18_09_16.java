import java.util.Random;
import java.util.Scanner;

public class example18_09_16 {

	   public static void main(String[] args) {
	        Random random = new Random();
	        Scanner scan = new Scanner(System.in);
	        try {
		        System.out.print("Введите количество строк в массиве: ");
	        int line_matrix = scan.nextInt();
	        System.out.print("Введите количество столбцов  в массиве: ");
	        int column_matrix = scan.nextInt();
	
	        int[][] matrix = new int[line_matrix][column_matrix];
	        
	        for (int i = 0; i < line_matrix; i++){
	            for (int j = 0; j < column_matrix; j++){
	            	matrix[i][j] = random.nextInt(10);
	            }
	        }
	        
	        for(int[] row: matrix)
	        {
	            for(int element: row)
	                System.out.print(element+" ");
	            System.out.println();
	        }
	        
	        System.out.print("Какой столбец вывести из массива: ");
	        int numb = scan.nextInt() - 1;
	        
	        for (int i = 0; i < line_matrix; i++){
	            System.out.println(matrix[i][numb]);
	        }
	        
	    } catch (ArrayIndexOutOfBoundsException e){
	        System.out.println("Число вышло за пределы массива");
	    } catch (Exception e){
	        System.out.println("Введено некорректное число");
	    } 
	}
}