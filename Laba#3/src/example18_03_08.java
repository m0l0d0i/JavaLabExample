public class example18_03_08 {
    public static void main(String[] args) {


        char[] chars = new char[10];
        char charA = 'A';
        int count = 0;

        while (count < 10) 
        {
            if (charA == 'A' || charA == 'E' || charA == 'I' || charA == 'O' || charA == 'U' || charA == 'Y') 
            {
                charA++;
                continue;
            }
            chars[count] = charA;
            count++;
            charA++;
        }
        for (char Chars : chars) 
        {
            System.out.print(Chars + " ");
        }   
    }
}