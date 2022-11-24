public class example18_06_07 
{
    public static void main(String[] args) 
    {
        char[] arr = new char[]{'A','-','+'};

        for (int a=0; a < arr.length; a++)
        {
            System.out.println(arr[a]+ ": " + Program.symbCode(arr)[a]);
        }
    }

    static class Program
    {
        static int[] symbCode(char[] symbArr)
        {
            int[] code = new int[symbArr.length];
            for (int a=0; a<code.length; a++)
            {
                code[a]=symbArr[a];
            }
            
            return code;
        }
    }
}