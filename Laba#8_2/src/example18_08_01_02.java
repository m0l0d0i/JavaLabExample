import java.io.File;

public class example18_08_01_02
{
    public static void main(String[] args) 
    {
        try
        {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();

            if (f1.exists())
            {
                System.out.println("Success!");
                System.out.println("Full path #1: " + f1.getAbsolutePath());
            }

            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Full path #2: " + f2.getAbsolutePath());

            File f3 = new File("C:\\Users\\User\\Desktop\\Урфу\\Лабы\\JavaLabExample\\Laba#8");
            f3.mkdirs();
            System.out.println("Full path #3: " + f3.getAbsolutePath());
        } catch (Exception e)
        {
            System.out.println("Warning!!! Description: " + e);
        }
    }
}