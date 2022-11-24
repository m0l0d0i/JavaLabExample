import java.util.Scanner;

public class example18_03_04
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number:"); 
		int numb1 = scan.nextInt(); 
		
		System.out.print("Enter the second number:");
		int numb2 = scan.nextInt(); 
		
		if (numb1 < numb2) 
		{
			while (numb1 != numb2+1) {
				System.out.print(numb1+" ");
				numb1+=1;
			}
		}else if (numb2 < numb1) 
		{
			while (numb2 != numb1+1) {
				System.out.print(numb2+" ");
				numb2+=1;
			}			
		}else
			System.out.println(numb1);
	}
}