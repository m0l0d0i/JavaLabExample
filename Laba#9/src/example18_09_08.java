public class example18_09_08 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
        	System.out.println("Перехват ошибки в методе m, с выполнением секции finally");
        } finally {
            System.out.println("1");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}