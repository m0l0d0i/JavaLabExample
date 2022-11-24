public class example18_05_01
{
    public static void main(String[] args) 
    {
       Ex std = new Ex();
        
        std.Set('F');
        std.VozratKodSymvola();
        std.ShowSymbolСode();
    }
}

class Ex
{
    private char symbol;


    public void Set(char symbol)
    {
        this.symbol = symbol;
    }

    public int VozratKodSymvola()
    {
        return symbol;

    }

    public void ShowSymbolСode()
    {
        System.out.print("Object field: "+ symbol + ",  code of this symbol: "+(int)symbol);
    }
 }