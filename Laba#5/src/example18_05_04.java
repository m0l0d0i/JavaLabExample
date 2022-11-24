public class example18_05_04 {
    public static void main(String[] args) 
    {
        Ex myEx1 = new Ex(12, 'A');
        Ex myEx2 = new Ex(65.1267);
    }

    static class Ex 
    {
        private char ch1;
        private int int1;

        Ex(int int1, char ch1) 
        {
            this.ch1 = ch1;
            this.int1 = int1;
            int length = (int) (Math.log10(int1) + 1);
            double res = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result:" + res + "; ch:" + (double) ch1 + "; int:" + length);
        }

        Ex(double d) 
        {
            char ch1 = (char) d;
            int1 = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1);
        }
    }
}