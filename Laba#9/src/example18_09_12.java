public class example18_09_12 {	
	public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
	// Создан блок обработчик событий с выводом сообщения ошибки описанной в процедуре m
    public static void main(String[] args) {
    	try {
    		m(null, 0.000001);
    	} catch (IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    }
}