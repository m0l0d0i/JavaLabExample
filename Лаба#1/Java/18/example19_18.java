import java.lang.Math;

public class example19_18 
{
	static double a = 14.0, b = 13.5, c;
	public static void main(String[] args) 
	{
		System.out.println("catet a = " + a);
		System.out.println("catet b = " + b);
		System.out.printf("hypotenuse: %.2f", hyp());
	}
	
	public static double hyp() 
	{
		return c = Math.sqrt(a*a + b*b);
	}
	
	@SuppressWarnings("unused")
	private static double customMethod(double a, double b) 
	{
        return Math.exp(b * Math.log(a));
    }
}