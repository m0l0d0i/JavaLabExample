import java.io.*;
import java.util.Scanner;

public class example18_08_05 
{
    private static DataInput rd;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a filename => "); 
        String fname=sc.nextLine();
        try
        {
            File f1 = new File(fname);
            f1.createNewFile();
            
            System.out.println("Full path: "+ f1.getAbsolutePath());
            System.out.print("Count line => ");
            
            int n  = sc.nextInt();
            DataOutputStream dOut=
                    new DataOutputStream( new FileOutputStream(f1));
            sc.nextLine();
            
            for (int i = 0; i < n; i++) 
            {
                System.out.print("Enter a number for write in file => ");
                String s=sc.nextLine();
                dOut.writeUTF(s );
            }
            
            dOut.flush();
            dOut.close();
            
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            
            while (true) 
            {
                System.out.println(rd.readUTF());
            }
        } catch (Exception e) 
        {
            System.out.println("" + e);
        }
    }
}