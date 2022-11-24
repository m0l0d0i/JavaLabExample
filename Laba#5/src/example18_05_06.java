public class example18_05_06 
{
    public static void main(String[] args) 
    {
        Ex myEx = new Ex(1, 5);
        myEx.printInt();

        Ex myEx1= new Ex(6);
        myEx1.printInt();

        myEx.setInt(2, 10);
        myEx.printInt();

        myEx.setInt(2);
        myEx.printInt();
    }

    static class Ex 
    {
        private static int min;
        private static int max;

        static void setInt(int num1, int num2) 
        {
            System.out.println("Method setInt() with 2 arguments:");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }

        static void setInt(int num) 
        {
            System.out.println("Method setInt() with 1 argument:");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void printInt() 
        {
            System.out.println("minimum:" + min);
            System.out.println("maximum:" + max);
        }

        Ex(int num1, int num2) 
        {
            System.out.println("Ex constructor with 2 arguments:");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

        Ex(int num) 
        {
            System.out.println("Ex constructor with 1 argument:");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}