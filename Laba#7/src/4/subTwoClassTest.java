public class subTwoClassTest extends subOneClassTest 
{

    int num;

    public void setCharStrInt (char ch, String str, int num)
    {
        super.ch = ch;
        super.str = str;
        this.num = num;
    }

    subTwoClass (char ch, String str, int num)
    {
        super(ch,str);
        this.setCharStrInt(super.ch,super.str, num);
    }

    public int getInt() 
    {
        return num;
    }

    public String toString() 
    {
        String ThirdFieldValue =
                "\n number: " + this.getInt();

        return super.toString()+ThirdFieldValue;
    }
}