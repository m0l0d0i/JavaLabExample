import java.util.Scanner;

public class example18_09_15 {
	
	public static int summ(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum/arr.length;
	}
	
	public static void m() {
		System.out.print("Введите количество элементов: ");
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int numb, count = 0;
		int[] arr = new int[c];
		for (int i = 0; i < c; i++) {
			count++;
			System.out.print("Введите число #"+count+": ");
			numb = scan.nextInt();
			if (numb < 0) {
				throw new NegativeArraySizeException("Число меньше 0");
			}
			arr[i] = numb;
		}
		System.out.println(summ(arr));
	}
	
	public static void main(String[] args) {
		try {
			m();
		} catch(NegativeArraySizeException e) {
			System.out.println("Число является не положительным");
		} catch (Exception e){
            System.out.println("Введен не верный формат числа");
        }
	}
}