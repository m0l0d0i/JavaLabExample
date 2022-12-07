import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class example18_08_02_02
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        BufferedWriter out = null;
        
        try 
        {
            br = new BufferedReader(new FileReader("MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("MyFile2.txt"));

            int lineCount = 0;
            String s;
            
            while ((s = br.readLine()) != null)
            {
                lineCount++;
                if (lineCount == 1) 
                {
                	continue;
                }else if(lineCount == 2)
                {
                    out.write(s);
                    out.newLine();
                }else 
                {
                	try 
                    {
                    	String[] numbArray = s.split(" ");
                    	for (String numb : numbArray) {
                    		double d = Double.parseDouble(numb);
                    		if (d > 0) 
                    		{
                            out.write(numb);
                            out.newLine();
                    		}
						}

                    } catch (NumberFormatException e) 
                    {
                        System.out.println("Warning!");
                    }
                }
            }
        } catch (IOException e)
        {
            System.out.println("Warning!!");
        } finally
        {
            br.close();
            out.flush();
            out.close();
        }
    }
}