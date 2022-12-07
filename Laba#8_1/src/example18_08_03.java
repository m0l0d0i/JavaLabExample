import java.io.*;
import java.util.Arrays;

public class example18_08_03 
{
    public static void readAllByArray(InputStream in) throws IOException 
    {
        byte [] buff = new byte[5];
        while (true) 
        {
            int count = in.read(buff);
            if (count != -1)
            {
                System.out.println("Count: " + count + ", Buff: "
                + Arrays.toString(buff) + ", Str: "
                + new String(buff, 0, count, "cp1251"));
            } else 
            {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException 
    {
        String fileName = "MyFile1.txt";
        InputStream inFile = null;

        try 
        {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e)
        {
            System.out.println("Warning open or close file" + fileName + e);
        } finally 
        {
            if (inFile != null)
            {
                try
                {
                    inFile.close();
                } catch (IOException ignore){}
            }
        }
    }
}