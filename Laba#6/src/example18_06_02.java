public class example18_06_02 
{
    public static void main(String[] args) 
    {
        Inc inc = new Inc();
        
        for (int i = 0; i<10; i++)
        {
            System.out.println(inc.getInc());
        }
    }

    static class Inc
    {
        private static int numb = 0;

        static int getInc()
        {
            numb++;
            System.out.print("numb: ");
            return numb;
        }
    }
}