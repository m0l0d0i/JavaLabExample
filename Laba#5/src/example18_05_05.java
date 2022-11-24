public class example18_05_05 
{
    public static void main(String[] args) 
    {
        Ex myEx = new Ex(15);
        System.out.println("Numb:" + myEx.ReturnInt());

        myEx.Set();
        System.out.println("Numb:" + myEx.ReturnInt());
        
        myEx.Set(28);
        System.out.println("Numb:" + myEx.ReturnInt());

        myEx.Set(104);
        System.out.println("Numb:" + myEx.ReturnInt());

        myEx.Set(-28);
        System.out.println("Numb:" + myEx.ReturnInt());
    }

    static class Ex 
    {
        private int int1;
        public void Set(int n) 
        {
            System.out.println("Method Set() with an argument");
            int1 = n;
            if (n >= 100) 
            {
                int1 = 100;
            }
            if (n <= 0) 
            {
                int1 = 0;
            }
        }

        public void Set() 
        {
            System.out.println("Method Set() without an argument");
            int1 = 0;
        }

        public int ReturnInt() 
        {
            return int1;
        }

        Ex(int int1) 
        {
            System.out.println("Ex() constructor: ");
            this.Set(int1);
        }
    }
}