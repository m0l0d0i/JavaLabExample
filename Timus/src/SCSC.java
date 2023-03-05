import java.util.Scanner;

public class SCSC 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the planned budget: ");
		double budget = scan.nextDouble();
		
		System.out.print("Enter the scheduled delivery date: ");
		double deliveryDate = scan.nextDouble();
		
		System.out.print("Enter the month of verification: ");
		double verification = scan.nextDouble();
		
		System.out.print("Enter the project readiness: ");
		double projectReadiness = scan.nextDouble();
		
		System.out.print("Funds spent for today: ");
		double fundsSpent = scan.nextDouble();
		
		double realBg = 100 * fundsSpent / projectReadiness;
		double spendingMonth = 100 * verification / projectReadiness;
		System.out.print("The projected budget expenditure is: \t "+ realBg +" y.e. \n"+
						"Projected project completion date: \t"+spendingMonth+ " y.e. \n"+
						"The delay will be: \t "+(spendingMonth-deliveryDate)+" mounth y.e. \n"+
						"The overspend will be: \t"+(realBg-budget)+" y.e.");
		
		scan.close();
	}
}