public class example18_03_07 {
    public static void main(String[] args) {


        char[] chars = new char[10];
        char charA = 'A';
        int count = 0;
        int n = 10;

        while (count < n) 
        {
            chars[count] = charA;
            charA +=2;
            count++;
        }
       
        for (char Chars : chars) 
        {
            System.out.print(Chars + " ");
        }  
        System.out.println();
        
        for (int i = n-1; i >= 0 ; i--) 
        {
        	System.out.print(chars[i] + " ");
        }
    }
}