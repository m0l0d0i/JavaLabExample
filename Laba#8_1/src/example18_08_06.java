import java.io.*;

public class example18_08_06 
{
    public static void main(String[] args) throws IOException 
    {
        Reader in = null;
        Writer out = null;
        try 
        {
            in = new FileReader("MyFile1.txt");
            out = new FileWriter("MyFile2.txt", true);
            int oneByte;
            
            while ((oneByte = in.read()) != -1) 
            {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
                break;
            }
        } catch (IOException e) 
        {
            System.out.println("Warning!!!!");
        } finally
        {
            in.close();
            out.close();
        }
    }
}