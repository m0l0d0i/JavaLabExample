//Последовательность перехвата должна соответствовать иерархии классов исключений(поменял блоки исключений 2 и 3)
public class example18_09_06 {
	public static void main(String[] args) {
	    try {
	        System.out.println("0");
	        throw new NullPointerException("ошибка");
	    } catch (ArithmeticException e) {
	        System.out.println("1");
	    } catch (RuntimeException e) {
	        System.out.println("3");
	    } catch (Exception e) {
	        System.out.println("2");
	    } 
	    System.out.println("4");
	}
}