public class subTwoClassTest extends subOneClassTest
{
    String str;

    subTwoClass (char ch, int num, String str)
    {
        setValue(ch, num, str);
    }

    void setValue(char ch , int num, String str) 
    {
        super.setValue(ch,num);
        this.str = str;
    }

    public String getStr()
    {
        return str;
    }

    public String toString() 
    {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr();
                
        return super.toString()+ThirdFieldValue;
    }
}