import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class example18_08_03_02
{
    public static void main(String[] args) throws IOException
    {
    	char[] soglAlphabet = 
    			new char[] {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        BufferedReader br = null;
        BufferedWriter out = null;
        
        try 
        {
            br = new BufferedReader(new FileReader("MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("MyFile2.txt"));

            int lineCount = 0;
            int wordCount = 0;
            String s;
            
            while ((s = br.readLine()) != null)
            {
                lineCount++;
                String[] s1 = s.split(" ");
                for (String str : s1) 
                {
                	char c = str.toLowerCase().charAt(0);
                	
                	for (char alphabet : soglAlphabet) {
						if (c == alphabet)
						{
							wordCount++;
			                out.write(lineCount + ": " + str.replace(",", "").replace(".", ""));
			                out.newLine();
						}
					}
				}
            	out.write("word count on line № "+lineCount+": "+wordCount);
            	out.newLine();
            	wordCount = 0;
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