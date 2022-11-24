public class example19_19 
{
	static double a = 14.0, b = 13.5, c;
	public static void main(String[] args) 
	{
		System.out.println("katet a = " + a);
		System.out.println("katet b = " + b);
		System.out.printf("hypotenuse: %.2f", hyp(a, b));
	}
	
	public static double hyp(double katet1, double katet2) 
	{
		return c = Math.sqrt(customMethod(katet1, 2) + customMethod(katet2, 2));
	}
	
	private static double customMethod(double a, double b) 
	{
        return Math.exp(b * Math.log(a));
    }
}