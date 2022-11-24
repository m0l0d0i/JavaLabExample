public class example18_05_02
{
    public static void main(String[] args) {
    	Alphabate alpha = new Alphabate();
    	alpha.print();
    }
}

class Alphabate
{
    private char s1 = 'A' ,s2 = 'D';


    public void print()
    {
        for (;s1 <= s2; s1++) {
            System.out.println(s1);
        }   
    }
 }
