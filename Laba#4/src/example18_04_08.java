import java.util.Scanner;

public class example18_04_08
{
    static class Caeser 
    {
        public static final String alhadet = "abcdefghijklmnopqrstuvwxyz";
        
        public static String Encrypt(String text, int shift)
        {
            String result = "";
            for (int i = 0; i < text.length(); i++)
            {
                result = result + Caeser.shift(text.charAt(i), shift);
            }
            return result;
        }
        
        private static char shift(char symbol, int shift)
        {    
            if (alhadet.indexOf(symbol) != -1) {
                var oldIndex = alhadet.indexOf(symbol);
                var newIndex = (oldIndex + shift) % alhadet.length();
                return alhadet.charAt(newIndex);
            }
            
            return symbol;
        }
    }

    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);

        System.out.print("Enter the encryption text: ");
        String text = id.nextLine();
        text = text.toLowerCase();

        System.out.print("Enter a key: ");
        int shift = id.nextInt();
        
        System.out.print("Text after conversion: ");
        var encryptedText = Caeser.Encrypt(text, shift);
        System.out.println(encryptedText);
        
        System.out.print("Perform reverse conversion? (y/n): ");
        char decrypt = id.next().charAt(0); 
        
        switch (decrypt) 
        {
			case ('y'): 
			{
		        System.out.print("Reverse conversion: ");
		        var decryptedText = Caeser.Encrypt(encryptedText, Caeser.alhadet.length() - shift);
		        System.out.println(decryptedText);
		        break;
			}
			case ('n'): 
			{
		        System.out.print("Bye!");
		        break;
			}
			default:
				System.out.print("Enter the correct answer!");
		}

    }
}