public class example18_06_05
{
    public static void main(String[] args) 
    {    
    System.out.print("Calculation without recursion for the number 5: ");
    SqrNotRecursion.factorialSqrNotRecursion(5);
    SquareRecursion.factorialSqrRecursion(6);
    
    }

    static class SqrNotRecursion 
    {
        static void factorialSqrNotRecursion(int numb) 
        {
            int c = 0;
            while (numb > 0) 
            {
                c += numb * numb;
                numb--;
            }
            System.out.println(c);
        }
    }

    static class SquareRecursion 
    {
        static int c = 0;
        
        static void factorialSqrRecursion (int numb) 
        {
            if (numb > 0) 
            {
                c += numb * numb;
                factorialSqrRecursion(numb - 1);
            }else 
            {
                SquareRecursion.print();
                SquareRecursion.setNull();
            }
        }

        static void print() 
        {
            System.out.println("Calculation with recursion for the number 6: " + c);
        }

        static void setNull() 
        {
            c = 0;
        }
    }
}