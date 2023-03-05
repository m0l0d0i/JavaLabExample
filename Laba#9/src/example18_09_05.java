public class example18_09_05 {
	public static void main(String[] args) {
	    try {
	        System.out.println("0");
	        throw new RuntimeException("ошибка");
	    } catch (NullPointerException e) {
	        System.out.println("1");
	    }
	    
	    //Перехват ошибки(Ошибка исправлена)
	    catch (RuntimeException e) {
	        System.out.println("Перехват ошибки(Ошибка исправлена)");
	    }
	    
	    System.out.println("2");
	}
}